package ch9.projects.threedemensionalshapes;

import static java.lang.Math.PI;

public abstract class CylinderShape implements Shape {
    private int radius;
    private int height;

    public CylinderShape(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double getVolume() {
        return PI * Math.pow(radius, 2) * height;
    }
    public abstract double getSurfaceArea();
}
