package InterceptorWeather.Interceptor;

import InterceptorWeather.Business.Context;

public interface Interceptor {
    boolean process(Context c);
}
