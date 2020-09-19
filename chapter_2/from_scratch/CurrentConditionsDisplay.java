public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private double pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println(
            "Temperature: " + temperature +
            " C, Humidity: " + humidity +
            " %, Pressure: " + pressure + " atm"
        );
    }

}