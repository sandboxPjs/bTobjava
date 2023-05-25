package ch9.exercises.cash;

public class Cash implements Asset {
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    public double getMarketValue() {
        return amount;
    }

    public double getProfit() {
        return 0.0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cash) {
            Cash cash = (Cash) obj;
            if (Math.abs(this.amount - cash.amount) < 0.001) { // if numbers are close to one another
                return true;
            }
        }
        return false;
    }
}