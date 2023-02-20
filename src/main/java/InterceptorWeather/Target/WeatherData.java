package InterceptorWeather.Target;

import InterceptorWeather.Interceptor.MeasurementDTO;

import java.util.ArrayList;

// this is the target
public class WeatherData implements Subject, Context {
    private ArrayList<Observer> observers;
    private MeasurementDTO m;

    private static WeatherData singleton = null;
    public static WeatherData get() {
        if(WeatherData.singleton == null) {
            WeatherData.singleton = new WeatherData();
            return singleton;
        } else {
            return singleton;
        }
    }

    private WeatherData() {
        observers = new ArrayList<Observer>();
        new DisplayCurrentConditions(this);
        new DisplayStatistics(this);
        new DisplayForecast(this);
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(m.getTemperature(), m.getHumidity(), m.getPressure());
        }
    }

    @Override
    public WeatherData setMeasurement(MeasurementDTO m) {
        this.m = m;
        return this;
    }

    @Override
    public MeasurementDTO getMeasurement() {
        return m;
    }
}
