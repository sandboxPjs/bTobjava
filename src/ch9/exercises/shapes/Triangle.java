package ch9.exercises.shapes;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double getPerimeter() {
        return a + b + c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle rectangle = (Triangle) obj;
            if (Math.abs(this.a - rectangle.a) < 0.001 &&
                    Math.abs(this.b - rectangle.b) < 0.001 &&
                    Math.abs(this.c - rectangle.c) < 0.001) {
                return true;
            }
        }
        return false;
    }
}
