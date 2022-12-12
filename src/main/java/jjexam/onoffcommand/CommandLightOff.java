package jjexam.onoffcommand;

public class CommandLightOff implements Command {

    private final Light light;

    public CommandLightOff(Light light) {
        this.light = light;
    }

    @Override
    public Command execute() {
        light.switchOn();
        return this;
    }

    @Override
    public void undo() {
        light.switchOff();
    }
}
