package InterceptorWeather.Interceptor;

public interface Interceptor {
    boolean before(MeasurementContext context);
    void after(MeasurementContext context);
}
