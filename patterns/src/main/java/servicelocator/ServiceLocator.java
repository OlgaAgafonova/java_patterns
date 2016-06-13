package main.java.servicelocator;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String serviceName) {

        Service service = cache.getService(serviceName);

        if (service != null) {
            return service;
        }

        ServiceInitialization context = new ServiceInitialization();
        service = (Service) context.lookup(serviceName);
        cache.addService(service);
        return service;
    }
}
