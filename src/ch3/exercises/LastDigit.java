package ch3.exercises;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(3572));
        System.out.println(lastDigit(-947));
        System.out.println(lastDigit(6));
        System.out.println(lastDigit(35));
        System.out.println(lastDigit(123456));
    }

    public static int lastDigit(int number) {
        return Math.abs(number) % 10;
    }
}
