package FrankeRect;

public class Rectangle {
    private int length;
    private int width;


    public Rectangle(int l, int w) {length = l; width = w;}

    //Default
    public Rectangle() {};
    public void setLength(int x) {length = x;}
    public void setWidth(int x) {width = x;}

    public int getLength() {return length;}
    public int getWidth() {return width;}

    public int area()
    {
        return this.length * this.width;
    }
}
