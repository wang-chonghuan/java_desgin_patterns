package jjexam.weatherobserver;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
