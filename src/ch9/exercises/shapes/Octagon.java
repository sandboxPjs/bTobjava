package ch9.exercises.shapes;

import static java.lang.Math.PI;

public class Octagon implements Shape {
    private double side;
    public Octagon (double side) {
        this.side = side;
    }
    public double getArea() {
        return 2 * side * side * (1 + Math.sqrt(2));
    }
    public double getPerimeter() {
        return 8 * side;
    }
}
