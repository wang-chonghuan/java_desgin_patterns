package InterceptorWeather.Interceptor;

import lombok.AllArgsConstructor;
import lombok.Data;


// this is the context
@Data
@AllArgsConstructor
public class MeasurementDTO {
    private double temperature;
    private double humidity;
    private double pressure;

    public String toString() {
        return "MeasurementDTO{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
