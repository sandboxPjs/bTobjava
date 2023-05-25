package ch9.projects.threedemensionalshapes;

import static java.lang.Math.PI;

public class Cylinder extends CylinderShape {

    public Cylinder(int radius, int height) {
        super(radius, height);
    }
    public double getSurfaceArea() {
        return 2 * PI * getRadius() * (getHeight() + getRadius());
    }
    public int getDiameter() {
        return 2 * getRadius();
    }
}
