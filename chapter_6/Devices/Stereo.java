package Devices;

public class Stereo {
    private String location;
    private int volume;

    public Stereo(String location) {
        this.location = location;
        volume = 0;
    }

    public void on() {
        System.out.println("Stereo in " + location + " is turned on");
    }

    public void off() {
        System.out.println("Stereo in " + location + " is turned off");
    }

    public void setCD() {
        System.out.println("CD is set in Stereo in " + location);
    }

    public void setDvd() {
        System.out.println("DVD is set in Stereo in " + location);
    }

    public void setRadio() {
        System.out.println("Radio is set in Stereo in " + location);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo in " + location + " volume is set to" + volume);
    }
}