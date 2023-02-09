package ch3.exercises;

public class Pay {
    public static void main(String[] args) {
        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
    }

    public static double pay(double salary, int hours) {
        int overtime = hours - 8;
        return salary * (hours - Math.max(0, overtime)) + 1.5 * salary * Math.max(0, overtime);
    }
}
