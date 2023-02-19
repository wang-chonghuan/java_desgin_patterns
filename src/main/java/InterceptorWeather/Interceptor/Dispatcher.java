package InterceptorWeather.Interceptor;

public class Dispatcher {
    public void dispatchBefore(InterceptorGroup interceptorGroup, MeasurementContext context) throws Exception {
        for(var interceptor : interceptorGroup.getInterceptors()) {
            if(!interceptor.before(context)) {
                throw new Exception("dispatchBefore returns false for context: " + context.toString());
            }
        }
    }

    public void dispatchAfter(InterceptorGroup interceptorGroup, MeasurementContext context) {
        for(var interceptor : interceptorGroup.getInterceptors()) {
            interceptor.after(context);
        }
    }
}
