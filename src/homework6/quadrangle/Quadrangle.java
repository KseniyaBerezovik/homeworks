package homework6.quadrangle;

import homework6.Drawable;
import homework6.Shape;

public interface Quadrangle extends Shape, Drawable {
    double[] getDiagonals();
}