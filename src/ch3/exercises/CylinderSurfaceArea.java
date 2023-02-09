package ch3.exercises;

public class CylinderSurfaceArea {
    public static void main(String[] args) {
        System.out.println(cylinderSurfaceArea(3.0, 4.5));
    }
    public static double cylinderSurfaceArea(double radius, double height) {
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }
}
