package InterceptorWeather.Target;

public abstract class Observer {
    private Subject weatherData;

    public Observer(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public abstract void update(double temperature, double humidity, double pressure);

}
