package pattern.lesson2.observers;

import pattern.lesson2.observers.Observer.CurrentConditionsDisplay;
import pattern.lesson2.observers.Observer.HeatIndexDisplay;
import pattern.lesson2.observers.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        // Subject
        WeatherData weatherData = new WeatherData();

        // Observer
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(70, 55, 28.4f);
        weatherData.setMeasurements(20, 45, 22.4f);
//        weatherData.registerObserver(currentConditionsDisplay);
//        weatherData.removeObserver(currentConditionsDisplay);
//        System.out.println("------");
//        weatherData.setMeasurements(20, 45, 22.4f);
    }
}
