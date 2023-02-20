package InterceptorWeather.Interceptor;

import InterceptorWeather.Target.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorWarning implements Interceptor {

    private final double DANGER_TEMPERATURE_UPPER = 40.0;
    private final double DANGER_TEMPERATURE_LOWER = -10.0;
    private final double DANGER_PRESSURE_UPPER = 1100.0;
    private final double DANGER_PRESSURE_LOWER = 900.0;

    @Override
    public boolean process(Context c) {
        log.warn("test if it needs warning...");
        var m = c.getMeasurement();
        if (m.getTemperature() >= DANGER_TEMPERATURE_UPPER || m.getTemperature() <= DANGER_TEMPERATURE_LOWER) {
            log.warn("Temperature is outside of the safe range: {}", m.getTemperature());
        }

        if (m.getPressure() >= DANGER_PRESSURE_UPPER || m.getPressure() <= DANGER_PRESSURE_LOWER) {
            log.warn("Pressure is outside of the safe range: {}", m.getPressure());
        }
        return true;
    }
}
