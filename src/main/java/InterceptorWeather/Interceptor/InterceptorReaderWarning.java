package InterceptorWeather.Interceptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorReaderWarning extends InterceptorReader {

    private final double DANGER_TEMPERATURE_UPPER = 40.0;
    private final double DANGER_TEMPERATURE_LOWER = -10.0;
    private final double DANGER_PRESSURE_UPPER = 1100.0;
    private final double DANGER_PRESSURE_LOWER = 900.0;

    @Override
    public void after(MeasurementContext measurementContext) {
        log.warn("test if needs warning");
        if (measurementContext.getTemperature() >= DANGER_TEMPERATURE_UPPER || measurementContext.getTemperature() <= DANGER_TEMPERATURE_LOWER) {
            log.warn("Temperature is outside of the safe range: {}", measurementContext.getTemperature());
        }

        if (measurementContext.getPressure() >= DANGER_PRESSURE_UPPER || measurementContext.getPressure() <= DANGER_PRESSURE_LOWER) {
            log.warn("Pressure is outside of the safe range: {}", measurementContext.getPressure());
        }
    }
}
