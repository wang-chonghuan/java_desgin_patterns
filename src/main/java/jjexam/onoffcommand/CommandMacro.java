package jjexam.onoffcommand;

import java.util.ArrayList;
import java.util.List;

public class CommandMacro implements Command {

    private final List<Command> commands;

    public CommandMacro(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public Command execute() {
        this.commands.forEach(Command::execute);
        return this;
    }

    @Override
    public void undo() {
        this.commands.forEach(Command::undo);
    }
}
