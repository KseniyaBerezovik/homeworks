package homework6.triangle;

public class RightTriangle extends Triangle {

    public RightTriangle(double cachetsFirst, double cachetsSecond) {
        super(cachetsFirst, cachetsSecond, Math.sqrt(Math.pow(cachetsFirst, 2) + Math.pow(cachetsSecond, 2)));
    }

    public double getHypotenuse() {
        return sideC;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public double[] getHeights() {
        return new double[] {sideA, sideB, sideA * sideB / getHypotenuse()};
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("|\\");
        System.out.println("| \\");
        System.out.println("|__\\");
        System.out.println();
    }

    @Override
    public String toString() {
        return "прямоугольный " + super.toString();
    }
}