package InterceptorWeather.Target;

import InterceptorWeather.Interceptor.MeasurementDTO;

import java.security.MessageDigest;

public interface Context {
    void notifyObservers();
    WeatherData setMeasurement(MeasurementDTO m);
    MeasurementDTO getMeasurement();
}
