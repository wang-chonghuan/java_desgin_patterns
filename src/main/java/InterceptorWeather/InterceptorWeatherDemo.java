package InterceptorWeather;

// this is the entrance of the program
public class InterceptorWeatherDemo {
    public static void run() {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.receivedMeasurements(41, 65, 1000);
        weatherStation.receivedMeasurements(-50, 70, 1200);
        weatherStation.receivedMeasurements(20, 90, 3000);
    }
}
