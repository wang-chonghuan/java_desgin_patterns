import InterceptorWeather.WeatherStation;
import org.junit.Test;
import nl.altindag.log.LogCaptor;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class TestDemos {
    @Test
    public void testInterceptorLog() {
        LogCaptor logCaptor = LogCaptor.forClass(WeatherStation.class);
        InterceptorWeather.Application.run();
        assertThat(logCaptor.getErrorLogs(), contains("dispatch returns false for context: " +
                "MeasurementDTO{temperature=20.0, humidity=90.0, pressure=3000.0}"));
    }

    @Test
    public void testCommand() {
        Command.Demo.run();
    }

    @Test
    public void testInterpreterCalculator() {
        Interpreter.Demo.run();
    }

    @Test
    public void testAdapter() throws InterruptedException {
        Adapter.Demo.run();
    }

    @Test
    public void testInterceptor() {
        InterceptorWeather.Application.run();
    }
}
