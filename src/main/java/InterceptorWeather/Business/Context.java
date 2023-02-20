package InterceptorWeather.Business;

import InterceptorWeather.Interceptor.MeasurementDTO;

public interface Context {
    void notifyObservers();
    WeatherData setMeasurement(MeasurementDTO m);
    MeasurementDTO getMeasurement();
}
