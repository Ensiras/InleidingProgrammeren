package noelVaes.h8;

import static noelVaes.h8.Rectangle.ANGLES;
import static noelVaes.h8.Rectangle.getCount;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setHeight(-10);
        rect1.setWidth(-15);
        rect1.setX(20);
        rect1.setY(25);

        rect1.setWidth(-25);
        rect1.grow(-80);

        rect1.printRectangleValues();

        Rectangle rect2 = new Rectangle(20, 10);
        rect2.printRectangleValues();

        Rectangle rect3 = new Rectangle(-30, -40, 100, 500);
        rect3.printRectangleValues();

        System.out.println("Aantal rechthoeken: " + getCount());

        Rectangle rect4 = new Rectangle(rect3);
        rect4.printRectangleValues();

        System.out.println("Aantal rechthoeken: " + getCount());
        System.out.println("Aantal hoeken in een rechthoek: " + ANGLES);

    }
}
