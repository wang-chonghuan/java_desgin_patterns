package InterceptorWeather.Interceptor;

import InterceptorWeather.Target.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorPersistence implements Interceptor {
    @Override
    public boolean process(Context c) {
        log.info("write the context into database");
        return true;
    }
}
