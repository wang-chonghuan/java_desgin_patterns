package Interpreter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
    public static void run() {
        String str = "50 2 + 3 * -1 +";
        log.info(String.valueOf(ExpressionParser.parse(str)));
    }
}
