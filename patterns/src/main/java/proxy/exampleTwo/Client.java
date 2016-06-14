package proxy.exampleTwo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        List<ProductI> delivery = client.getProducts();
        System.out.println(delivery);
    }

    public List<ProductI> getProducts() {
        List<ProductI> products = new ArrayList<ProductI>();
        ProductI product = null;

        product = new Product(30600, "Spanish Scooters, BARS Incorporated(C)", true);
        products.add(new ProductProxy(product));

        product = new Product(20000, "Ford Focus, Ford Corp.", false);
        products.add(new ProductProxy(product));

        product = new Product(25000, "Italian Furniture, Italica Company", true);
        products.add(new ProductProxy(product));
        return products;
    }
}
