package practice_2;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(int discount) {
        this.price = this.price - this.price * discount / 100;
    }

    public void printInfo() {
        System.out.println("The price of " + name + " is " + price);
    }
}
