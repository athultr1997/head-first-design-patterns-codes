package Tests;

import Commands.GarageDoorOpenCommand;
import RemoteControls.SimpleRemoteControl;
import Devices.GarageDoor;

public class SimpleRemoteControlGarageDoorTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl =
            new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOpenCommand garageDoorOpenCommand =
            new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}