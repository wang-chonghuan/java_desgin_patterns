package jjexam.onoffcommand;

import java.util.*;

public class RemoteControl {
    private final Map<Integer, Command> onCommands = new HashMap<>();
    private final Map<Integer, Command> offCommands = new HashMap<>();
    private Command undoCommand = null;

    public RemoteControl() {
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.put(slot, onCommand);
        offCommands.put(slot, offCommand);
    }

    public void onButtonPushed(int slot) {
        undoCommand = onCommands.get(slot).execute();
    }

    public void offButtonPushed(int slot) {
        undoCommand = offCommands.get(slot).execute();
    }

    public void undoButtonPushed() {
        if(undoCommand != null)
            undoCommand.execute();
    }
}
