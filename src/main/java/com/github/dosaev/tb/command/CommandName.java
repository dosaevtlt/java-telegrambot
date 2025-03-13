package com.github.dosaev.tb.command;

import lombok.Getter;

/**
 * Enumeration for {@link Command}'s.
 */
@Getter
public enum CommandName {

    START("/start"),
    STOP("/stop"),
    STAT("/stat"),
    HELP("/help"),
    NO("/no");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

}
