package Devices;

public class GarageDoor{
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Garage Door in " + location + " is open");
    }

    public void down() {
        System.out.println("Garage Door in " + location + " is closed");
    }

    public void stop() {
        System.out.println("Garage Door in " + location + " stopped");
    }

    public void lightOn() {
        System.out.println("Garage Door in " + location + " light turned on");
    }

    public void lightOff() {
        System.out.println("Garage Door in " + location + " light turned off");
    }
}