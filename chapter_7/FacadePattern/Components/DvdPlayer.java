package Components;

public class DvdPlayer {
    private Amplifier amplifier;

    public void on() {
        System.out.println("DvdPlayer is turned on");
    }

    public void off() {
        System.out.println("DvdPlayer is turned off");
    }

    public void eject() {}
    public void pause() {}
    public void play() {}
    public void setSurroundAudio() {}
    public void setTwoChannelAudio() {}

    public void stop() {
        System.out.println("DvdPlayer is stopped");
    }

    public String toString() {
        return "DvdPlayer";
    }
}