package InterceptorAchitecturalPattern;

public class Dispatcher {
    public void dispatchBefore(InterceptorGroup interceptorGroup, Context context) {
        for(Interceptor interceptor : interceptorGroup.getInterceptors()) {
            interceptor.before(context);
        }
    }

    public void dispatchAfter(InterceptorGroup interceptorGroup, Context context) {
        for(Interceptor interceptor : interceptorGroup.getInterceptors()) {
            interceptor.after(context);
        }
    }
}
