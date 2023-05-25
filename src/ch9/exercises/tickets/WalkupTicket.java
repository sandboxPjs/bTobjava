package ch9.exercises.tickets;

public class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);
    }
    public double getPrice() {
        return 50;
    }
}
