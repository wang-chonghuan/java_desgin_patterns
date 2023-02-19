package InterceptorAchitecturalPattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public interface Context {
    void setState(State state);
    State getState();

    String getMessage();
    void setMessage(String message);
}
