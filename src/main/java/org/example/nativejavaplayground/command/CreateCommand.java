package org.example.nativejavaplayground.command;

import lombok.RequiredArgsConstructor;
import org.jline.terminal.Terminal;
import org.springframework.shell.command.annotation.Command;

@Command(command = "create")
@RequiredArgsConstructor
public class CreateCommand {

    private final Terminal terminal;

    @Command(command = "endpoint")
    public void createEndpoint() {
        terminal.writer().println("create endpoint");
        terminal.writer().flush();
    }

}
