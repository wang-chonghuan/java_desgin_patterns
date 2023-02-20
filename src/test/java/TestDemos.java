import InterceptorWeather.WeatherStation;
import org.junit.Test;

public class TestDemos {
    @Test
    public void testCommand() {
        Command.Demo.run();
    }

    @Test
    public void testInterpreterCalculator() { Interpreter.Demo.run(); }

    @Test
    public void testAdapter() throws InterruptedException { Adapter.Demo.run(); }

    @Test
    public void testInterceptor() {
        WeatherStation.run();
    }
}
