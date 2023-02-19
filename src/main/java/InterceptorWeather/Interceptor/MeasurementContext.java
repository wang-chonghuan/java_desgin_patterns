package InterceptorWeather.Interceptor;

import lombok.AllArgsConstructor;
import lombok.Data;


// this is the context
@Data
@AllArgsConstructor
public class MeasurementContext {
    private double temperature;
    private double humidity;
    private double pressure;

    public String toString() {
        return "MeasurementContext{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
