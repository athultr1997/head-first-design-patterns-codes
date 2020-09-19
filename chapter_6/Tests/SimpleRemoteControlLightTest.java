package Tests;

import Commands.LightOnCommand;
import RemoteControls.SimpleRemoteControl;
import Devices.Light;

public class SimpleRemoteControlLightTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl =
            new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}