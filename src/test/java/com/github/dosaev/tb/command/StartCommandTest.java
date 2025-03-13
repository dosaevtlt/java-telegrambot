package com.github.dosaev.tb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.dosaev.tb.command.CommandName.START;
import static com.github.dosaev.tb.command.StartCommand.START_MESSAGE;

@DisplayName("Unit-level testing for StartCommand")
class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService, telegramUserService);
    }
}
