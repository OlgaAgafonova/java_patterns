package proxy;

import java.io.IOException;

public class CommandExecutorReal implements CommandExecutor {

    public void runCommand(String command) throws IOException {
        Runtime.getRuntime().exec(command);
        System.out.printf("'%s' command executed.", command);
    }
}
