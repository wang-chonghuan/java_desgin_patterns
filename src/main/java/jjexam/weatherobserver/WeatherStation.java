package jjexam.weatherobserver;

public class WeatherStation {
    public static void run() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1, 1, 1);
        weatherData.measurementsChanged();
    }
}
