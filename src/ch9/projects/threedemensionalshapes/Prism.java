package ch9.projects.threedemensionalshapes;

public abstract class Prism implements Shape {
    private int height;
    private int length;
    private int width;

    public Prism(int height, int length ,int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public double getVolume() {
        return height * length * width;
    }
    public abstract double getSurfaceArea();
}
