package ch9.projects.threedemensionalshapes;

public class TriangularPrism extends Prism {
    private int sideA;
    private int sideC;
    public TriangularPrism(int height, int length, int width, int sideA, int sideC) {
        super(height, length, width);
        this.sideA = sideA;
        this.sideC = sideC;
    }
    public double getVolume() {
        return super.getVolume() / 2;
    }
    public double getSurfaceArea() {
        return (sideA + getWidth() + sideC) * getLength() + getWidth() * getHeight();
    }
    public int getSideA() {
        return sideA;
    }
    public int getSideC() {
        return sideC;
    }
}
