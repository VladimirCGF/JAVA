package entities;

public class ImportedProduct extends Product {

    private double customFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public ImportedProduct(double customFee) {
        this.customFee = customFee;
    }

    public ImportedProduct(String name, double price) {
    }

    private double totalPrice() {
        return this.getPrice() + this.customFee;
    }

    public String toString() {
        return this.getName()
                + " $"
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $"
                + String.format("%.2f", this.customFee)
                + ")";
    }
}
