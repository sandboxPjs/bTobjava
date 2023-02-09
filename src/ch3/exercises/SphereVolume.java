package ch3.exercises;

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println(sphereVolume(2.0));
    }

    public static double sphereVolume(double radius) {
        return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
