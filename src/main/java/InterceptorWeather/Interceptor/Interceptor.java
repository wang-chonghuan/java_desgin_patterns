package InterceptorWeather.Interceptor;

import InterceptorWeather.Target.Context;
import jjexam.weatherobserver.WeatherData;

public interface Interceptor {
    boolean process(Context c);
}
