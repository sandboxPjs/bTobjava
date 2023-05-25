package ch9.exercises.shapes;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle rectangle = (Circle) obj;
            if (Math.abs(this.radius - rectangle.radius) < 0.001) {
                return true;
            }
        }
        return false;
    }
}
