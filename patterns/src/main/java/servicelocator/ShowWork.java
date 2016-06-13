package main.java.servicelocator;

public class ShowWork {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("ServiceOne");
        service.execute();
        service = ServiceLocator.getService("ServiceTwo");
        service.execute();
        service = ServiceLocator.getService("ServiceOne");
        service.execute();
        service = ServiceLocator.getService("ServiceTwo");
        service.execute();
    }
}
