package ch9.projects.threedemensionalshapes;

import static java.lang.Math.PI;

public class Sphere implements Shape {
    private int radius;
    public Sphere(int radius) {
        this.radius = radius;
    }
    public double getVolume() {
        return (4 / 3.0) * PI * Math.pow(radius, 3);
    }
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }
    public int getRadius() {
        return radius;
    }

}
