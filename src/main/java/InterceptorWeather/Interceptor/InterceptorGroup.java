package InterceptorWeather.Interceptor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class InterceptorGroup {
    @Getter
    private List<Interceptor> interceptors = new ArrayList<>();

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }
}
