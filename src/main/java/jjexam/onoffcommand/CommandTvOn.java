package jjexam.onoffcommand;

public class CommandTvOn implements Command {

    private final Tv tv;

    public CommandTvOn(Tv tv) {
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
