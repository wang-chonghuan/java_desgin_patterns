package InterceptorWeather.Target;

import InterceptorWeather.Interceptor.MeasurementContext;

import java.util.ArrayList;

// this is the target
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
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
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(MeasurementContext context) {
        this.temperature = context.getTemperature();
        this.humidity = context.getHumidity();
        this.pressure = context.getPressure();
        measurementsChanged();
    }
}
