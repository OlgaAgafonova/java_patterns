package proxy.exampleTwo;

public class ProductProxy implements ProductI {

    private ProductI product;

    public ProductProxy(ProductI product) {
        this.product = product;
    }

    public boolean isDelivery() {
        return product.isDelivery();
    }

    public int getPrice() {
        if (isDelivery()) {
            return product.getPrice() - ProductI.DELIVERY_COST;
        }
        return product.getPrice();
    }

    public String getName() {
        if (!isDelivery()) {
            return "[NOT DELIVERED] " + product.getName();
        }
        return product.getName();
    }

    public String toString() {
        return getName() + " $" + getPrice();
    }
}
