package InterceptorWeather.Interceptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorReaderPersistence extends InterceptorReader {
    @Override
    public void after(MeasurementContext context) {
        log.info("write the context into database");
    }
}
