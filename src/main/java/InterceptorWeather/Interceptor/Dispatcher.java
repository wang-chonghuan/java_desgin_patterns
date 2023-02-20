package InterceptorWeather.Interceptor;

import InterceptorWeather.Business.Context;

public class Dispatcher {

    public void dispatch(
            InterceptorGroup interceptorGroup, Context context) throws Exception {
        for(var interceptor : interceptorGroup.getInterceptors()) {
            if(!interceptor.process(context)) {
                throw new Exception(
                        "dispatch returns false for context: " + context.getMeasurement().toString());
            }
        }
    }
}
