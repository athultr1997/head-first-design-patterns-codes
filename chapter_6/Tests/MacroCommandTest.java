package Tests;

import Commands.Command;
import Commands.CeilingFanOffCommand;
import Commands.CeilingFanOnCommand;
import Commands.LightOffCommand;
import Commands.LightOnCommand;
import Commands.MacroCommand;
import Commands.StereoOffCommand;
import Commands.StereoOnWithCDCommand;
import Devices.CeilingFan;
import Devices.Light;
import Devices.Stereo;
import RemoteControls.RemoteControl;

public class MacroCommandTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo);
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {lightOnCommand, stereoOnCommand, ceilingFanOnCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand, ceilingFanOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("-------Pushing Macro On--------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("-------Pushing Macro Off--------");
        remoteControl.offButtonWasPushed(0);
    }
}