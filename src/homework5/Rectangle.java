package homework5;

public class Rectangle {

    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    public int getArea() {
        int dx = this.rightDown.getX() - this.leftUp.getX();
        int dy = this.leftUp.getY() - this.rightDown.getY();
        return dx * dy;
    }

    public double getDiagonal() {
        return this.leftUp.distance(this.rightDown);
    }
}