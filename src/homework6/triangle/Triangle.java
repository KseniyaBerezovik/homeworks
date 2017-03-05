package homework6.triangle;

import homework6.Drawable;
import homework6.Shape;

public class Triangle implements Shape, Drawable {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double[] getHeights() {
        double temp = 2 * getArea();
        return new double[] {temp / sideA, temp / sideB, temp / sideC};
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("   /|");
        System.out.println("  / |");
        System.out.println("  \\ |");
        System.out.println("   \\|");
        System.out.println();
    }

    @Override
    public String toString() {
        return(String.format(
                "треугольник со сторонами: %.2f; %.2f; %.2f",
                sideA,
                sideB,
                sideC
        ));
    }
}
