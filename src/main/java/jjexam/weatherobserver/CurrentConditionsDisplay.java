package jjexam.weatherobserver;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    @Override
    public void display() {

    }

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }
}
