package InterceptorFilter;

import javax.swing.*;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new FilterAuthentication());
        filterManager.setFilter(new FilterDebug());

        var client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
