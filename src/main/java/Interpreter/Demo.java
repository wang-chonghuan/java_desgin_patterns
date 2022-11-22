package Interpreter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {

    // 表达式是一个可以用于判断一个语句真伪的规则，它定义了把什么语句判断为真，把什么语句判断为假
    // 返回一个规则（即表达式），该规则可以判断Robert或John是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert"); // 当上下文包含Robert时，robert表达式成立
        Expression john = new TerminalExpression("John"); // 当上下文包含John时，john表达式成立
        return new OrExpression(robert, john); // 当上下文使得robert表达式或john表达式成立时，getMaleExpression表达式成立
    }

    // 返回一个规则，该规则可以判断Julie已婚
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie"); // 当上下文包含Julie时，julie表达式成立
        Expression married = new TerminalExpression("Married"); // 当上下文包含Married时，married表达式成立
        return new AndExpression(julie, married); // 当上下文使得julie表达式且married表达式成立时，getMarriedWomanExpression表达式成立
    }

    /**
     * 根据题目的正确选项和备选选项，建立一个表达式
     * 用该表达式判断一个答案，是否是正确的
     * 规则是：全部答对，得满分。每答对一个，加一分。答错一个，得0分。
     */

    public static void run() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        log.info("John is male? {}", isMale.interpret("John"));
        log.info("Julie is male? {}", isMale.interpret("Julie"));
        log.info("Julie is a married woman? {}", isMarriedWoman.interpret("Married Julie"));
        log.info("Robert is a married woman? {}", isMarriedWoman.interpret("Married Robert"));
    }
}
