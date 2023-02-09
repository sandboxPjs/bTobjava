package ch3.exercises;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println(triangleArea(8, 5.2, 7.1));
    }

    public static double triangleArea(double one, double two, double three) {
        double s = (one + two + three) / 2;
        return Math.sqrt(s * (s - one) * (s - two) * (s - three));
    }
}
