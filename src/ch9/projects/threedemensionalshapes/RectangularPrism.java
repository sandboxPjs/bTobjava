package ch9.projects.threedemensionalshapes;

public class RectangularPrism extends Prism {
    public RectangularPrism(int height, int length ,int width) {
        super(height, length, width);
    }

    public double getSurfaceArea() {
        return 2 * (getLength() * getWidth() + getWidth() * getHeight() + getHeight() * getLength());
    }

    public double getDiagonalLength() {
        return Math.sqrt(getLength() * getLength() + getWidth() * getWidth() + getHeight() * getHeight());
    }
}
