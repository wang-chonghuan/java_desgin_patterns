package jjexam.onoffcommand;

public interface Command {
    public Command execute();
    public void undo();
}
