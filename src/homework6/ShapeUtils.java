package homework6;

import homework6.quadrangle.Parallelogram;
import homework6.quadrangle.Quadrangle;
import homework6.triangle.Triangle;

public class ShapeUtils  {
    public static boolean isShapeDrawable(Shape shape) {
        return shape instanceof Drawable;
    }
    public static boolean isShapeQuadrangle(Shape shape) {
        return shape instanceof Quadrangle;
    }
    public static boolean isShapeTriangle(Shape shape) {
        return shape instanceof Triangle;
    }
    public static boolean isShapeParallelogram(Shape shape) {
        return shape instanceof Parallelogram;
    }

    public static void print(String message, double... values) {
        System.out.print(message);
        for (double value : values)  {
            System.out.printf("%.2f  ", value);
        }
        System.out.println();
    }
}