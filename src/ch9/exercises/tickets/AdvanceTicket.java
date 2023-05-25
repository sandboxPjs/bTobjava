package ch9.exercises.tickets;

public class AdvanceTicket extends Ticket {
    int numberOfDays;
    public AdvanceTicket(int number, int numberOfDays) {
        super(number);
        if (numberOfDays < 0) {
            throw new IllegalArgumentException();
        }
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
    public double getPrice() {
        if (numberOfDays >= 10) {
            return 30;
        } else {
            return 40;
        }
    }
}
