package ch3.exercises;

public class Area {
    public static void main(String[] args) {
        System.out.println(area(2.0));
    }

    public static double area(double radius) {
        return Math.PI * Math.pow(radius,2);
    }
}
