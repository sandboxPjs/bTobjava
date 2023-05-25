package ch9.projects.threedemensionalshapes;

import static java.lang.Math.PI;

public class Cone extends CylinderShape {
    double slantHeight;
    public Cone(int radius, int height) {
        super(radius, height);
        this.slantHeight = Math.sqrt(radius * radius + height * height);
    }
    public double getVolume() {
        return super.getVolume() / 3;
    }
    public double getSurfaceArea() {
        return PI * getRadius() * (slantHeight + getRadius());
    }

    public double getSlantHeight() {
        return slantHeight;
    }
}
