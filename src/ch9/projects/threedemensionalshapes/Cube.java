package ch9.projects.threedemensionalshapes;

public class Cube extends RectangularPrism {
    public Cube(int height, int length ,int width) {
        super(height, length, width);
        if (!checkLength()) {
            throw new IllegalArgumentException();
        }
    }

    private boolean checkLength() {
        return getHeight() == getLength() && getLength() == getWidth();
    }
}
