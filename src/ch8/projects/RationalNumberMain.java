package ch8.projects;

public class RationalNumberMain {
    public static void main(String[] args) {
        RationalNumber rn = new RationalNumber();
        RationalNumber rn2 = new RationalNumber(4,5);
        RationalNumber rn3 = new RationalNumber(3,6);
        RationalNumber rn4 = new RationalNumber(3,-6);
        System.out.println(rn);
        System.out.println(rn2);
        System.out.println(rn3);
        System.out.println(rn4);
        System.out.println();
        RationalNumber rn5 = new RationalNumber(4,5);
        RationalNumber rn6 = new RationalNumber(3,6);
        rn5.divide(rn6);
        System.out.println(rn5);
    }
}
