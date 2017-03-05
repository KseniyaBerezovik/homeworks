package homework6.quadrangle;

public class Square extends Rectangle {

    public Square(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public double[] getDiagonals() {
        return new double[] {Math.sqrt(2) * sideA};
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }

    @Override
    public void draw() {
        System.out.println(" ____");
        System.out.println("|    |");
        System.out.println("|____|");
        System.out.println("");
    }

    @Override
    public String toString() {
        return String.format("квадрат со стороной: %.2f", sideA);
    }
}
