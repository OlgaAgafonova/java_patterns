package proxy.exampleTwo;

public class Product implements ProductI {
    private int price;
    private String name;
    private boolean delivery;

    public Product(int price, String name, boolean delivery) {
        this.price = price;
        this.name = name;
        this.delivery = delivery;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public String toString() {
        return getName() + " $" + getPrice();
    }
}
