package InterceptorWeather.Target;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DisplayForecast extends Observer {


    public DisplayForecast(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        log.info("do some forecast display");
    }
}
