package InterceptorStudy.InterceptorAchitecturalPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterceptorReader implements Interceptor {
    @Override
    public void before(Context context) {
        log.info("InterceptorReader before BEGIN");
        String message = context.getMessage();
        log.info("received message: " + message);
        log.info("InterceptorReader before END");
    }

    @Override
    public void after(Context context) {
        log.info("InterceptorReader after");
    }
}
