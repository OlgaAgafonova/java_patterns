package frontcontroller;

public class FrontControllerTest {

    public static void main(String[] args) {
        FrontController frontController = new FrontController(new Dispatcher());
        frontController.dispatchRequest("HOME");
        System.out.println("--------------------------");
        frontController.dispatchRequest("STUDENT");
    }
}
