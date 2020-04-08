package noelVaes.h8Classes;

public class Rectangle {
    private int x;
    private int y;
    private int height;
    private int width;
    public static final int ANGLES;
    private static int count;

    static {
        ANGLES = 4;
    }

    {
        setCount(getCount() + 1);
    }

    public Rectangle() {
        this(0, 0, 0 ,0);
    }

    public Rectangle(int height, int width) {
        this(height, width, 0, 0);
    }

    public Rectangle(int height, int width, int x, int y) {
        this.setHeight(height);
        this.setWidth(width);
        this.x = x;
        this.y = y;
    }

    public Rectangle(Rectangle rect) {
        this(rect.getHeight(), rect.getWidth(), rect.getX(), rect.getY());
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Rectangle.count = count;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? -width : width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }

    public void grow(int d) {
        int growWith = d < 0 ? -d : d;
        setHeight(this.getHeight() + growWith);
        setWidth(this.getWidth() + growWith);
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return getHeight() * 2 + getWidth() * 2;
    }

    public void printRectangleValues() {
        System.out.printf("Hoogte: %d, lengte: %d, x: %d, y: %d %n", this.height, this.width, this.x, this.y);
        System.out.printf("Omtrek: %.2f, Oppervlakte: %.2f %n", this.getPerimeter(), this.getArea());
        System.out.println();
    }
}
