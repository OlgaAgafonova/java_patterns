package proxy;

public class ProxyTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Veles", "wrongPassword");
        try {
            executor.runCommand("ipconfig /all");
            executor.runCommand("  del C:\\abc.txt");
        } catch (Exception e) {
            System.err.println("Exception : " + e.getMessage());
        }
    }

}
