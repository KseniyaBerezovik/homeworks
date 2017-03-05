package homework6.quadrangle;

public class Parallelogram implements Quadrangle {
    protected double sideA;
    protected double sideB;
    protected double sharpCorner;

    public Parallelogram( double sideA, double sideB, double sharpCorner) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sharpCorner = sharpCorner;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSharpCorner() {
        return sharpCorner;
    }

    public double[] getHeights() {
        double temp = Math.sin(Math.toRadians(sharpCorner));
        return new double[] {
                sideA * temp,
                sideB * temp,
        };
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double getArea() {
        return Math.sin(Math.toRadians(sharpCorner)) * sideA * sideB;
    }

    @Override
    public double[] getDiagonals() {
        double temp1 =  Math.pow(sideA, 2) + Math.pow(sideB, 2);
        double temp2 = 2 * sideA * sideB * Math.cosh(Math.toRadians(sharpCorner));
        return new double[] {Math.sqrt(temp1 - temp2), Math.sqrt(temp1 + temp2)};
    }

    @Override
    public void draw() {
        System.out.println("  _________");
        System.out.println(" /        /");
        System.out.println("/________/");
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format(
                "параллелограмм cо сторонами: %.2f; %.2f и углом %.2f",
                sideA,
                sideB,
                this.sharpCorner
        );
    }
}