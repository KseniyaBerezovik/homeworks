package homework6.quadrangle;

import homework6.triangle.RightTriangle;

public class Rectangle implements Quadrangle {
    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double[] getDiagonals() {
        return new double[]{new RightTriangle(sideA, sideB).getHypotenuse()};
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println(" _________");
        System.out.println("|         |");
        System.out.println("|_________|");
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format(
                "прямоугольник со сторонами: %.2f; %.2f",
                sideA,
                sideB
        );
    }
}