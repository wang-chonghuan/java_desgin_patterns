package InterceptorWeather.Interceptor;

import InterceptorWeather.Business.Context;

public class InterceptorDisplay implements Interceptor {
    @Override
    public boolean process(Context c) {
        c.notifyObservers();
        return true;
    }
}
