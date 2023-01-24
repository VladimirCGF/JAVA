package entities;

public class UsedProduct extends Product {
    private String data;

    public UsedProduct(String name, double price, String data) {
        super(name, price);
        this.data = data;
    }

    public UsedProduct(String data, double price) {
        this.data = data;

    }

    public String toString() {
        return this.getName()
                + " (used) $"
                + String.format("%.2f", getPrice())
                + " Data: "
                + this.data;

    }
}
