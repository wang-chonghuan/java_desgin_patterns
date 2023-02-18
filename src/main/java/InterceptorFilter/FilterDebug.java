package InterceptorFilter;

public class FilterDebug implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
