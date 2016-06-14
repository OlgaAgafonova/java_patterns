package templateMethod;

public abstract class Pizza {
    //template method
    public final void preparePizza() {
        chooseBread();
        addIngredients();
        heating();
        addCheese();
        addToppings();
    }

    public abstract void chooseBread();
    public abstract void addIngredients();

    //default methods
    protected void heating() {
        System.out.println("Heating for 10 minutes!");
    }

    protected void addCheese() {
        System.out.println("Adding Cheese!");
    }

    protected void addToppings() {
        System.out.println("Adding Topinngs!");
    }
}
