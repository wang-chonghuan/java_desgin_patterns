package jjexam.weatherobserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements SetMeasurements, GetMeasurements, Subject {

    private final List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> {
            o.update(temperature, humidity, pressure);
        });
    }

    @Override
    public float getMeasurements() {
        return temperature;
    }

    @Override
    public float getHumidity() {
        return humidity;
    }

    @Override
    public float getPressure() {
        return pressure;
    }

    @Override
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
