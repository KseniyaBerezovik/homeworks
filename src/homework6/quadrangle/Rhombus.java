package homework6.quadrangle;

public class Rhombus extends Parallelogram {

    public Rhombus(double sideA, double sharpCorner) {
        super(sideA, sideA, sharpCorner);
    }

    @Override
    public double getArea() {
        return Math.sin(Math.toRadians(sharpCorner)) * Math.pow(sideA, 2);
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }

    @Override
    public double[] getDiagonals() {
        return new double[] {
                sideA * Math.sqrt(2 + 2 * Math.cos(Math.toRadians(sharpCorner))),
                2 * sideA * Math.sin(Math.toRadians(sharpCorner/ 2))
        };
    }

    @Override
    public double[] getHeights() {
        return new double[] {getArea() / sideA};
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println(" /\\");
        System.out.println("/  \\");
        System.out.println("\\  /");
        System.out.println(" \\/");
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("ромб со сторонами %.2f и углом %.2f", sideA, sharpCorner);
    }
}