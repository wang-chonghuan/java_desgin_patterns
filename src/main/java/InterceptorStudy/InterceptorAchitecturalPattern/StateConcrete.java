package InterceptorStudy.InterceptorAchitecturalPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateConcrete implements State {

    private InterceptorGroup interceptorReaders = new InterceptorGroup();
    private InterceptorGroup interceptorWriters = new InterceptorGroup();


    @Override
    public void doAction(Context context) {
        log.info("in concrete state");

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatchBefore(interceptorReaders, context);
        dispatcher.dispatchBefore(interceptorWriters, context);
        log.info("Context message: " + context.getMessage());
        dispatcher.dispatchAfter(interceptorReaders, context);
        dispatcher.dispatchAfter(interceptorWriters, context);

        context.setState(this);
    }

    public void addInterceptorReader(Interceptor interceptor) {
        interceptorReaders.addInterceptor(interceptor);
    }

    public void addWriterInterceptor(Interceptor interceptor) {
        interceptorWriters.addInterceptor(interceptor);
    }
}
