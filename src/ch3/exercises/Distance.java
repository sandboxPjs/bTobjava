package ch3.exercises;

public class Distance {
    public static void main(String[] args) {
        System.out.println(distance(1, 0, 4, 4));
        System.out.println(distance(10, 2, 3, 5));
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
