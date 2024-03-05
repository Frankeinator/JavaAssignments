package FrankeRect;

public class RectangleDemo {
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4, 9);
        Rectangle rect3 = new Rectangle(rect2);
        rect1.setLength(3);
        rect1.setWidth(9);
        int area = rect1.area();
        System.out.println(area);
        System.out.println(rect1.equals(rect2));
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect3.equals(rect2));
    }
}