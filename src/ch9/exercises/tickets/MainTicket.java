package ch9.exercises.tickets;

public class MainTicket {

    public static void main(String[] args) {
        Ticket[] test = {new WalkupTicket(1),
                new AdvanceTicket(2, 20),
                new StudentAdvanceTicket(3, 9)};
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
