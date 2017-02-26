package homework5;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        int dx = Math.abs(point.getX() - this.getX());
        int dy = Math.abs(point.getY() - this.getY());
        return Math.sqrt(dy * dy + dx * dx);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}