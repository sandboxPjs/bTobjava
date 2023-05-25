package ch9.exercises.tickets;

public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int number, int numberOfDays) {
        super(number, numberOfDays);
    }

    public double getPrice() {
        return super.getPrice() / 2;
    }

    public String toString() {
        return super.toString() + " (ID required)";
    }
}
