package InterceptorStudy.InterceptorAchitecturalPattern;

public interface Interceptor {
    void before(Context context);
    void after(Context context);
}
