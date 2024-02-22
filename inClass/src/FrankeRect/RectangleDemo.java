package FrankeRect;

public class RectangleDemo {
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle();
        rect1.setLength(3);
        rect1.setWidth(9);
        int area = rect1.area();
        System.out.println(area);
    }
}