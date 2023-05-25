package ch9.exercises.shapes;

import static java.lang.Math.PI;

public class Dodecagon implements Shape {
    private double side;
    public Dodecagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return 3 * (2 + Math.sqrt(3)) * side * side;
    }

    public double getPerimeter() {
        double apothem = side / (2 * Math.tan(PI / 12));
        return 24 * apothem * (2 - Math.sqrt(3));
    }
}
