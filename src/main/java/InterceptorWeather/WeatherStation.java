package InterceptorWeather;

import InterceptorWeather.Interceptor.*;
import InterceptorWeather.Target.DisplayCurrentConditions;
import InterceptorWeather.Target.DisplayForecast;
import InterceptorWeather.Target.DisplayStatistics;
import InterceptorWeather.Target.WeatherData;
import lombok.extern.slf4j.Slf4j;

// this is the state machine
@Slf4j
public class WeatherStation {

    // these are the states of this state machine
    WeatherData weatherData;
    private InterceptorGroup groupBefore;
    private InterceptorGroup groupAfter;

    public WeatherStation() {
        weatherData = new WeatherData();
        groupBefore = new InterceptorGroup();
        groupAfter = new InterceptorGroup();
        // add interceptors to the respective groups
        groupBefore.addInterceptor(new InterceptorWriterValidator());
        groupAfter.addInterceptor(new InterceptorReaderPersistence());
        groupAfter.addInterceptor(new InterceptorReaderWarning());
        // add display observer to WeatherData, which is the target and subject
        new DisplayCurrentConditions(weatherData);
        new DisplayStatistics(weatherData);
        new DisplayForecast(weatherData);
    }

    // this is doAction of the state machine
    public void receivedMeasurements(float temperature, float humidity, float pressure) {
        MeasurementContext context = new MeasurementContext(temperature, humidity, pressure);
        Dispatcher dispatcher = new Dispatcher();
        try {
            dispatcher.dispatchBefore(groupBefore, context);
            weatherData.setMeasurements(context);
            dispatcher.dispatchAfter(groupAfter, context);
        }
        catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}