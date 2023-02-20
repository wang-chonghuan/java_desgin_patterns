package InterceptorWeather.Interceptor;

import InterceptorStudy.InterceptorAchitecturalPattern.InterceptorReader;
import InterceptorWeather.Target.Context;

public class InterceptorDisplay implements Interceptor {
    @Override
    public boolean process(Context c) {
        c.notifyObservers();
        return true;
    }
}
