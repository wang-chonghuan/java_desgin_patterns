package InterceptorWeather;

import InterceptorWeather.Interceptor.*;
import InterceptorWeather.Business.WeatherData;
import lombok.extern.slf4j.Slf4j;

// this is the state machine, and the main entrance
@Slf4j
public class WeatherStation {

    // these are the states of this state machine
    WeatherData weatherData = WeatherData.get();
    private InterceptorGroup interceptors = new InterceptorGroup();

    public void attachInterceptor(Interceptor ic) {
        interceptors.addInterceptor(ic);
    }

    // this is doAction of the state machine
    public void measurementEvent(float temperature, float humidity, float pressure) {
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