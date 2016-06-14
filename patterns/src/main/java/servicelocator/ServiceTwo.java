package servicelocator;

public class ServiceTwo implements Service{

    public String getName() {
        return "ServiceTwo";
    }

    public void execute() {
        System.out.println("Executing ServiceTwo");
    }
}
