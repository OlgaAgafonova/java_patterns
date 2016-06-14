package templateMethod;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza = new SweetCornPizza();
        pizza.preparePizza();

        System.out.println("-------------------------");

        pizza = new MexicanPizza();
        pizza.preparePizza();
    }
}
