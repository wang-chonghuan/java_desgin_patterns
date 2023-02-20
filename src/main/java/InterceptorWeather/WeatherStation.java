package InterceptorWeather;

import InterceptorWeather.Interceptor.*;
import InterceptorWeather.Target.WeatherData;
import lombok.extern.slf4j.Slf4j;

// this is the state machine, and the main entrance
@Slf4j
public class WeatherStation {

    public static void run() {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.receivedMeasurements(41, 65, 1000);
        weatherStation.receivedMeasurements(-50, 70, 1200);
        weatherStation.receivedMeasurements(20, 90, 3000);
    }

    // these are the states of this state machine
    WeatherData weatherData = WeatherData.get();
    private InterceptorGroup interceptors;

    public WeatherStation() {
        interceptors = new InterceptorGroup();
        interceptors.addInterceptor(new InterceptorValidation());
        interceptors.addInterceptor(new InterceptorDisplay());
        interceptors.addInterceptor(new InterceptorPersistence());
        interceptors.addInterceptor(new InterceptorWarning());
    }

    // this is doAction of the state machine
    public void receivedMeasurements(float temperature, float humidity, float pressure) {
        weatherData.setMeasurement(new MeasurementDTO(temperature, humidity, pressure));
        var dispatcher = new Dispatcher();
        try {
            dispatcher.dispatch(interceptors, weatherData);
        }
        catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}