package Interpreter;

public class NumberInterpreter implements Interpreter {

    private final int number;
    NumberInterpreter(int number) {
        this.number = number;
    }
    NumberInterpreter(String number) {
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
