package InterceptorWeather.Interceptor;

import InterceptorWeather.Target.Context;
import jjexam.weatherobserver.WeatherData;

public class Dispatcher {

    public void dispatch(InterceptorGroup interceptorGroup, Context context) throws Exception {
        for(var interceptor : interceptorGroup.getInterceptors()) {
            if(!interceptor.process(context)) {
                throw new Exception("dispatch returns false for context: " + context.toString());
            }
        }
    }
}
