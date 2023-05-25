package ch9.exercises.shapes;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2.0 * (width + height);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            if (Math.abs(this.height - rectangle.height) < 0.001 && Math.abs(this.width - rectangle.width) < 0.001) {
                return true;
            }
        }
        return false;
    }
}
