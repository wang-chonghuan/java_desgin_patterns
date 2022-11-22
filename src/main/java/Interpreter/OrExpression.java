package Interpreter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
