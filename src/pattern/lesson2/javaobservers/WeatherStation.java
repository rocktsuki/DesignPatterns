package pattern.lesson2.javaobservers;

public class WeatherStation {
    public static void main(String[] args) {
        // Subject
        WeatherData weatherData = new WeatherData();

        // Observer
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(70, 55, 28.4f);
        weatherData.setMeasurements(20, 45, 22.4f);
    }
}
