package InterceptorWeather.Interceptor;

public class InterceptorWriter implements Interceptor {
    @Override
    public boolean before(MeasurementContext context) {
        return true;
    }

    @Override
    public void after(MeasurementContext context) {

    }
}
