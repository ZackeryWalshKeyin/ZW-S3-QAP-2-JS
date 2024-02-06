public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    public void setBottomRightXY(int x, int y) {
        bottomRight.setXY(x, y);
    }

    public double getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public double getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }
}
