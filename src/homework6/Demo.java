package homework6;

import homework6.quadrangle.*;
import homework6.triangle.EquilateralTriangle;
import homework6.triangle.RightTriangle;
import homework6.triangle.Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = createShapesArray();

        for (Shape shape : shapes) {
            System.out.println(shape);

            if (ShapeUtils.isShapeDrawable(shape)) {
                ((Drawable) shape).draw();
            }

            if (ShapeUtils.isShapeTriangle(shape)) {
                ShapeUtils.print("высоты: ", ((Triangle) shape).getHeights());
            }

            if (ShapeUtils.isShapeQuadrangle(shape)) {
                ShapeUtils.print("диагонали:", ((Quadrangle) shape).getDiagonals());
                if (ShapeUtils.isShapeParallelogram(shape)) {
                    ShapeUtils.print("высоты: ", ((Parallelogram) shape).getHeights());
                }
            }

            ShapeUtils.print("периметр: ", shape.getPerimeter());
            ShapeUtils.print("площадь: ", shape.getArea());
            System.out.println("______________________________________________________");
        }
    }

    public static List<Shape> createShapesArray() {
        List<Shape> shapes = new ArrayList<>();
        Collections.addAll(shapes,
                new Parallelogram(3, 19, 45),
                new Rectangle(6, 4),
                new Square(2),
                new Triangle(6, 9, 7.7),
                new RightTriangle(8, 6),
                new EquilateralTriangle(4),
                new Circle(2.2),
                new Rhombus(5, 50)
        );
        return shapes;
    }
}