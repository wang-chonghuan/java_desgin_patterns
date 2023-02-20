package InterceptorWeather.Interceptor;

import InterceptorWeather.Business.Context;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorValidation implements Interceptor {

    private final double MIN_TEMPERATURE = -100.0;
    private final double MAX_TEMPERATURE = 100.0;
    private final double MIN_HUMIDITY = 0.0;
    private final double MAX_HUMIDITY = 100.0;
    private final double MIN_PRESSURE = 800.0;
    private final double MAX_PRESSURE = 1200.0;

    @Override
    public boolean process(Context c) {
        log.info("Measurement Event Received {}", c.getMeasurement().toString());
        var temperature = c.getMeasurement().getTemperature();
        var humidity = c.getMeasurement().getHumidity();
        var pressure = c.getMeasurement().getPressure();
        // Check if the fields are within the valid ranges using the getters
        if (temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE &&
                humidity >= MIN_HUMIDITY && humidity <= MAX_HUMIDITY &&
                pressure >= MIN_PRESSURE && pressure <= MAX_PRESSURE) {
            // If all fields are within the valid ranges, round them to two decimal places using the setters
            c.getMeasurement().setTemperature(Math.round(temperature * 100.0) / 100.0);
            c.getMeasurement().setHumidity(Math.round(humidity * 100.0) / 100.0);
            c.getMeasurement().setPressure(Math.round(pressure * 100.0) / 100.0);
            log.info("Measurement context validate");
            return true;
        } else {
            // Log an error message with the invalid values and return false
            log.error("Measurement context contains invalid values - {}", c.getMeasurement().toString());
            return false;
        }
    }
}
