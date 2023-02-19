package InterceptorStudy.InterceptorAchitecturalPattern;

import lombok.Getter;
import lombok.Setter;

public class ContextConcrete implements Context {
    @Getter
    @Setter
    private State state;
    @Getter
    @Setter
    private String message;
}
