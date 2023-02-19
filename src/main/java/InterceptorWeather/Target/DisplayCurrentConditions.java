package InterceptorWeather.Target;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DisplayCurrentConditions extends Observer {
    private Subject weatherData;

    public DisplayCurrentConditions(WeatherData d) {
        super(d);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        log.info("do some current conditions display");
    }
}
