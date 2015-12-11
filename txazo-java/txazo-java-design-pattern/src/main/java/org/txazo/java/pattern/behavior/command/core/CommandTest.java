package org.txazo.java.pattern.behavior.command.core;

import org.junit.Test;

/**
 * CommandTest
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 22.07.2015
 */
public class CommandTest {

    @Test
    public void test() {
        TV tv = new TV();
        Command onCommand = new OnCommand(tv);
        Command offCommand = new OffCommand(tv);
        Command channelCommand = new ChannelCommand(tv);
        MacroCommand autoCommand = new AutoMacroCommand();
        autoCommand.addCommand(onCommand);
        autoCommand.addCommand(channelCommand);
        autoCommand.addCommand(offCommand);
        Control control = new Control(onCommand, offCommand, channelCommand, autoCommand);
        control.turnOn();
        control.changeChannel();
        control.turnOff();
        control.auto();
    }

}
