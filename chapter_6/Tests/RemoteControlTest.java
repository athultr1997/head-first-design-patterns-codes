package Tests;

import RemoteControls.RemoteControl;
import Commands.CeilingFanOffCommand;
import Commands.CeilingFanOnCommand;
import Commands.GarageDoorCloseCommand;
import Commands.GarageDoorOpenCommand;
import Commands.LightOffCommand;
import Commands.LightOnCommand;
import Commands.StereoOffCommand;
import Commands.StereoOnWithCDCommand;
import Devices.CeilingFan;
import Devices.GarageDoor;
import Devices.Light;
import Devices.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light diningRoomLight = new Light("Dining Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand diningRoomLightOn = new LightOnCommand(diningRoomLight);
        LightOffCommand diningRoomLightOff = new LightOffCommand(diningRoomLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, diningRoomLightOn, diningRoomLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}