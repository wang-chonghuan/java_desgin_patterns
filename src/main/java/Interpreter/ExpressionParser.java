package Interpreter;

import java.util.Stack;

public class ExpressionParser {
    private static Stack<Interpreter> stack = new Stack<Interpreter>();

    public static int parse(String oriStr) {
        String[] splitStrList = oriStr.split(" ");
        for(String curStr: splitStrList) {
            if(OperatorUtil.isSymbol(curStr)) {
                Interpreter firstInterpreter = stack.pop();
                Interpreter secondInterpreter = stack.pop();
                Interpreter expressionObject = OperatorUtil.getExpressionObject(firstInterpreter, secondInterpreter, curStr);
                stack.push(new NumberInterpreter(expressionObject.interpret()));
            } else {
                stack.push(new NumberInterpreter(curStr));
            }
        }
        return stack.pop().interpret();
    }
}
