package jjexam.onoffcommand;

public class CommandTvOff implements Command {

    private final Tv tv;

    public CommandTvOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public Command execute() {
        tv.switchOn();
        return this;
    }

    @Override
    public void undo() {
        tv.switchOff();
    }
}
