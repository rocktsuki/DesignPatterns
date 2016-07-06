package pattern.lesson2.observers.Subject;

import pattern.lesson2.observers.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i < 0) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Object o : observers) {
            ((Observer) o).update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
