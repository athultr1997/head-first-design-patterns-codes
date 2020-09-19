public class HeatIndex implements DisplayElement, Observer {

    private double heatIndex;
    private Subject weatherData;

    HeatIndex(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temperature, double humidity, double pressure) {
        heatIndex = temperature * humidity * 0.5;
        display();
    }

    public void display() {
        System.out.println("HeatIndex = " + heatIndex);
    }

}