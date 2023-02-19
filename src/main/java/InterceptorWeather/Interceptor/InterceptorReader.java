package InterceptorWeather.Interceptor;

public class InterceptorReader implements Interceptor {
    @Override
    public boolean before(MeasurementContext context) {
        return true;
    }

    @Override
    public void after(MeasurementContext context) {

    }
}
