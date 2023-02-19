package InterceptorStudy.WeatherStation;

public class DisplayCurrentConditions implements Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public DisplayCurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
