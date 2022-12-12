package jjexam.onoffcommand;

public class CommandLightOn implements Command {

    private final Light light;

    public CommandLightOn(Light light) {
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
