package RemoteControls;

import Commands.Command;
import Commands.NoCommand;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i=0; i < 7; ++i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        lastCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("\n-------Remote Control-------\n");
        for (int i = 0; i < onCommands.length; ++i) {
            stringBuilder.append("[slot " + i + "] " +
                onCommands[i].getClass().getName() + "    " +
                offCommands[i].getClass().getName() + "\n"
            );
        }
        stringBuilder.append(
            "[undo]" +
            lastCommand.getClass().getName() + "\n"
        );
        return stringBuilder.toString();
    }
}