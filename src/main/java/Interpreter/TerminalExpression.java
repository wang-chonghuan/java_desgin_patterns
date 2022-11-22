package Interpreter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TerminalExpression implements Expression {

    private final String data;

    @Override
    public boolean interpret(String context) {
        return context.contains(data) ? true : false;
    }
}
