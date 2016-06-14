package servicelocator;

public class ServiceOne implements Service {

    public String getName() {
        return "ServiceOne";
    }

    public void execute() {
        System.out.println("Executing ServiceOne");
    }
}
