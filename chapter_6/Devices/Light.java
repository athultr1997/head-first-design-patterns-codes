package Devices;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light in " + location + " is turned on");
    }
    public void off() {
        System.out.println("Light in " + location + " is turned off");
    }
}