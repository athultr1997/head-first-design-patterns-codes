public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(34.0, 45.0, 3.4);
        weatherData.setMeasurements(51.0, 70.0, 6.9);
        weatherData.setMeasurements(40.0, 45.0, 9.3);
    }
}