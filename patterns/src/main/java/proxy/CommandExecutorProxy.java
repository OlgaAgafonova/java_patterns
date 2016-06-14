package proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutorReal executor;

    public CommandExecutorProxy(String user, String password) {
        if ("Veles".equals(user) && "PshdkjGTT".equals(password)) {
            isAdmin = true;
        }
        executor = new CommandExecutorReal();
    }

    public void runCommand(String command) throws Exception {
        if (command.trim().startsWith("del") && !isAdmin) {
            throw new Exception("del command is not allowed for non-admin users.");
        } else {
            executor.runCommand(command);
        }
    }
}
