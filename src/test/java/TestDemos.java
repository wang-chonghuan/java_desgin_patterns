import Command.Demo;
import org.junit.Test;

public class TestDemos {
    @Test
    public void testCommand() {
        Command.Demo.run();
    }

    @Test
    public void testInterpreter() { Interpreter.Demo.run(); }
}
