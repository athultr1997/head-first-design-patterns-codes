import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class WeatherData {
    private double temperature;
    private double humidity;
    private double pressure;

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }

    public void setTemperature(double newTemperature) {
        double oldTemperature = this.temperature;
        this.temperature = newTemperature;
        this.pcs.firePropertyChange("temperature", oldTemperature, newTemperature);
    }

    public void setHumidity(double newHumidity) {
        double oldHumidity = this.humidity;
        this.humidity = newHumidity;
        this.pcs.firePropertyChange("humidity", oldHumidity, newHumidity);
    }

    public void setPressure(double newPressure) {
        double oldPressure = this.pressure;
        this.pressure = newPressure;
        this.pcs.firePropertyChange("pressure", oldPressure, newPressure);
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
    }
}