package servicelocator;

public class ServiceInitialization {

    public Object lookup(String serviceName){
        if(serviceName.equalsIgnoreCase("SERVICEONE")){
            System.out.println("Looking up and creating a new ServiceOne object");
            return new ServiceOne();
        }
        else if (serviceName.equalsIgnoreCase("SERVICETWO")){
            System.out.println("Looking up and creating a new ServiceTwo object");
            return new ServiceTwo();
        }
        return null;
    }

}
