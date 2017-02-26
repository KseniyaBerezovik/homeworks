package homework5;

public class Demo {

    public static void main(String[] args) {
        Point a = new Point(2, 6);
        Point b = new Point(5, 6);

        System.out.println(String.format(
                "Расстояние от точки А(%d, %d) до точки В(%d, %d) составляет: %.2f",
                a.getX(),
                a.getY(),
                b.getX(),
                b.getY(),
                a.distance(b)
        ));

        Point leftUp = new Point(3, 6);
        Point rightDown = new Point(9, 3);

        Rectangle rectangle = new Rectangle(leftUp, rightDown);

        System.out.println("Площадь прямоугольника составляет: " + rectangle.getArea());
        System.out.println("Диагональ прямоугольника составляет: " + rectangle.getDiagonal());
    }
}
