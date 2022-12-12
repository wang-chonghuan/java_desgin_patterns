package jjexam.onoffcommand;

import java.util.List;

public class Client {
    public static void useRemoteControl() {
        var remoteControl = new RemoteControl();
        var light = new Light("lightname");
        var tv = new Tv("tvname");
        remoteControl.setCommand(1, new CommandLightOn(light), new CommandLightOff(light));
        remoteControl.setCommand(2, new CommandTvOn(tv), new CommandTvOff(tv));
        remoteControl.setCommand(3,
                new CommandMacro(List.of(new CommandLightOn(light), new CommandTvOn(tv))),
                new CommandMacro(List.of(new CommandLightOff(light), new CommandTvOff(tv))));
        remoteControl.onButtonPushed(3);
        remoteControl.offButtonPushed(3);
        remoteControl.undoButtonPushed();
    }
}
