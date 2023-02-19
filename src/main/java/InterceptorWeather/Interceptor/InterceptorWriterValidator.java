package InterceptorWeather.Interceptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorWriterValidator extends InterceptorWriter {

    private final double MIN_TEMPERATURE = -100.0;
    private final double MAX_TEMPERATURE = 100.0;
    private final double MIN_HUMIDITY = 0.0;
    private final double MAX_HUMIDITY = 100.0;
    private final double MIN_PRESSURE = 800.0;
    private final double MAX_PRESSURE = 1200.0;

    @Override
    public boolean before(MeasurementContext measurementContext) {
        log.info("Measurement context validating - temperature: {}, humidity: {}, pressure: {}",
                measurementContext.getTemperature(), measurementContext.getHumidity(), measurementContext.getPressure());
        // Check if the fields are within the valid ranges using the getters
        if (measurementContext.getTemperature() >= MIN_TEMPERATURE && measurementContext.getTemperature() <= MAX_TEMPERATURE &&
                measurementContext.getHumidity() >= MIN_HUMIDITY && measurementContext.getHumidity() <= MAX_HUMIDITY &&
                measurementContext.getPressure() >= MIN_PRESSURE && measurementContext.getPressure() <= MAX_PRESSURE) {
            // If all fields are within the valid ranges, round them to two decimal places using the setters
            measurementContext.setTemperature(Math.round(measurementContext.getTemperature() * 100.0) / 100.0);
            measurementContext.setHumidity(Math.round(measurementContext.getHumidity() * 100.0) / 100.0);
            measurementContext.setPressure(Math.round(measurementContext.getPressure() * 100.0) / 100.0);
            log.info("Measurement context validated - temperature: {}, humidity: {}, pressure: {}",
                    measurementContext.getTemperature(), measurementContext.getHumidity(), measurementContext.getPressure());
            return true;
        } else {
            // Log an error message with the invalid values and return false
            log.error("Measurement context contains invalid values - temperature: {}, humidity: {}, pressure: {}",
                    measurementContext.getTemperature(), measurementContext.getHumidity(), measurementContext.getPressure());
            return false;
        }
    }
}
