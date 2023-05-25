package ch9.exercises.tickets;

public abstract class Ticket {
    private int number;
    public Ticket(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }
    public abstract double getPrice();

    public String toString() {
        return String.format("Number: %d, Price: %.1f", getNumber(), getPrice());
    }
}
