package InterpreterCalculator;

public class MultiplyInterpreter implements Interpreter {

    private final Interpreter firstInterpreter;
    private final Interpreter secondInterpreter;

    MultiplyInterpreter(Interpreter firstInterpreter, Interpreter secondInterpreter) {
        this.firstInterpreter = firstInterpreter;
        this.secondInterpreter = secondInterpreter;
    }

    @Override
    public int interpret() {
        return firstInterpreter.interpret() * secondInterpreter.interpret();
    }
}
