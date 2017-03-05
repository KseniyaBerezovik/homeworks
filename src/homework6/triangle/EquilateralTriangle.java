package homework6.triangle;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getPerimeter() {
        return 3 * sideA;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * Math.pow(sideA, 2);
    }

    @Override
    public double[] getHeights() {
        return new double[]{Math.sqrt(3) / 2 * sideA};
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
        System.out.println();
    }

    @Override
    public String toString() {
        return "равносторонний " + super.toString();
    }
}
