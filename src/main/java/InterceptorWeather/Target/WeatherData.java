package InterceptorWeather.Target;

import InterceptorWeather.Interceptor.MeasurementDTO;

import java.util.ArrayList;

// this is the context
public class WeatherData implements Subject, Context {
    private static WeatherData singleton = null;
    private ArrayList<Observer> observers;
    private MeasurementDTO m;
    private WeatherData() {
        observers = new ArrayList<Observer>();
        // add observers
        new DisplayCurrentConditions(this);
        new DisplayStatistics(this);
        new DisplayForecast(this);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(m.getTemperature(), m.getHumidity(), m.getPressure());
        }
    }


    public static WeatherData get() {
        if(WeatherData.singleton == null) {
            WeatherData.singleton = new WeatherData();
            return singleton;
        } else {
            return singleton;
        }
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
