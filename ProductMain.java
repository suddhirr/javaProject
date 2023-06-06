class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalSold = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + "(s) sold successfully.");
        } else {
            System.out.println("Insufficient quantity of " + name + " to sell.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product("Book", 10.99, 70);
        Product product2 = new Product("Pen", 1.99, 50);
        Product product3 = new Product("Notebook", 5.99, 20);

        product1.sell(30);
        product2.sell(50);
        product3.sell(10);

        System.out.println("Total quantity of sold: " + Product.getTotalSold());
    }
}