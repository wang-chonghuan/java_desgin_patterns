package InterceptorStudy.InterceptorFilter;

public class FilterAuthentication implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
