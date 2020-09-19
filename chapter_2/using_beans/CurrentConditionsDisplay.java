import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {
    private double temperature;
    private double humidity;
    private double pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        if (propertyName.equals("temperature")) {
            temperature = (double) evt.getNewValue();
            display();
        } else if (propertyName.equals("humidity")) {
            humidity = (double) evt.getNewValue();
            display();
        } else if (propertyName.equals("pressure")) {
            pressure = (double) evt.getNewValue();
            display();
        }
    }

    public void display() {
        System.out.println(
            "Temperature: " + temperature +
            " C, Humidity: " + humidity +
            " %, Pressure: " + pressure + " atm"
        );
    }
}