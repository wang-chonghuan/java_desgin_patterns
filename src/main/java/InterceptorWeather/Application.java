package InterceptorWeather;

import InterceptorWeather.Interceptor.InterceptorDisplay;
import InterceptorWeather.Interceptor.InterceptorPersistence;
import InterceptorWeather.Interceptor.InterceptorValidation;
import InterceptorWeather.Interceptor.InterceptorWarning;

public class Application {
    public static void run() {
        WeatherStation weatherStation = new WeatherStation();
        // create and attach interceptors
        weatherStation.attachInterceptor(new InterceptorValidation());
        weatherStation.attachInterceptor(new InterceptorDisplay());
        weatherStation.attachInterceptor(new InterceptorPersistence());
        weatherStation.attachInterceptor(new InterceptorWarning());
        // receiving event
        weatherStation.measurementEvent(41, 65, 1000);
        weatherStation.measurementEvent(-50, 70, 1200);
        weatherStation.measurementEvent(20, 90, 3000);
    }
}
