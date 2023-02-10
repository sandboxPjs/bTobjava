package ch3.projects;

public class BankTable {
    public static void main(String[] args) {
        printBalance(1000, 6.5, 25);
    }

    public static void printBalance(int initialInvestment, double interestRate, int period) {
        System.out.print("year");
        System.out.print("\t");
        System.out.print("current balance");
        System.out.print("\t");
        System.out.print("\t");
        System.out.print("interest");
        System.out.print("\t");
        System.out.print("new balance");
        System.out.println();

        double interest = 0.0;
        double annualInvestment = 100.0;
        double currentBalance = initialInvestment;
        double newBalance = 0.0;
        for (int i = 1; i <= period; i++) {
            System.out.print(i);
            System.out.print("\t");
            System.out.print("\t");
            System.out.print(Math.round(currentBalance));
            System.out.print("\t");
            System.out.print("\t");
            System.out.print("\t");
            System.out.print("\t");

            interest = currentBalance * interestRate / 100.0;
            newBalance = currentBalance + interest;

            System.out.print(Math.round(interest));
            System.out.print("\t");
            System.out.print("\t");
            System.out.print("\t");
            System.out.print(Math.round(newBalance));
            System.out.print("\t");
            System.out.println();

            currentBalance = newBalance + annualInvestment;
        }
    }
}
