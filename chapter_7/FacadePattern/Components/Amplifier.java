package Components;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {
        System.out.print("Ammplifier is turned on");
    }

    public void off() {
        System.out.print("Ammplifier is turned off");
    }

    public void setCd() {}
    public void setDvd() {}
    public void setStereoSound() {}
    public void setSurroundSound() {}
    public void setTuner() {}
    public void setVolume() {}

    public String toString() {
        return "hello";
    }
}