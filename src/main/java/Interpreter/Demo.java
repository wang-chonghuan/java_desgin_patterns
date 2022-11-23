package Interpreter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
    public static void run() {
        String str = "6 100 11 + *";
        log.info(String.valueOf(ExpressionParser.parse(str)));
    }
}
