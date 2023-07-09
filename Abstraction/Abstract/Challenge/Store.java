package Abstraction.Abstract.Challenge;

import java.util.ArrayList;
import java.util.Objects;

final class OrderItem {
    private final int qty;
    private final ProductForSale product;

    OrderItem(int qty, ProductForSale product) {
        this.qty = qty;
        this.product = product;
    }

    public int qty() {
        return qty;
    }

    public ProductForSale product() {
        return product;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        OrderItem that = (OrderItem) obj;
        return this.qty == that.qty &&
                Objects.equals(this.product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qty, product);
    }

    @Override
    public String toString() {
        return "OrderItem[" +
                "qty=" + qty + ", " +
                "product=" + product + ']';
    }
}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Oil Painting", 1350,
                "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sculpture", 2000,
                "Bronze work by JKF, produced in 1950"));

        storeProducts.add(new Furniture("Desk", 500,
        "Mahogany Desk"));

        storeProducts.add(new Furniture("Lamp", 200,
        "Tiffany Lamp with Hummingbirds"));

        listProducts();

        System.out.println("\nOrder 1");
        ArrayList order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        ArrayList order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts() {

        for (ProductForSale item : storeProducts) {
            System.out.println("---------------");
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                      int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (OrderItem item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
