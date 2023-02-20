package InterceptorWeather.Business;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
}
