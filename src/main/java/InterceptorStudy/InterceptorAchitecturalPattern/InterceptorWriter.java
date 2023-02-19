package InterceptorStudy.InterceptorAchitecturalPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorWriter implements Interceptor {
    @Override
    public void before(Context context) {
        log.info("InterceptorWriter before");
    }

    @Override
    public void after(Context context) {
        log.info("InterceptorWriter after BEGIN");
        String message = context.getMessage().toUpperCase();
        context.setMessage(message);
        log.info("processed message: " + context.getMessage());
        log.info("InterceptorWriter after END");
    }
}
