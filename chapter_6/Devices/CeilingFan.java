package Devices;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    String location;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling Fan in " + location + " set to High");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling Fan in " + location + " set to Medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Ceiling Fan in " + location + " set to Low");
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling Fan in " + location + " turned off");
    }

    public int getSpeed() {
        return speed;
    }
}