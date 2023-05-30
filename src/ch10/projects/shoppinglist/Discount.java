package ch10.projects.shoppinglist;

public class Discount {
    private int amount;
    private double price;
    public Discount(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }
    public double getPrice() {
        return price;
    }
}
