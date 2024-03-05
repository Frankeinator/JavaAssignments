package FrankeRect;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int l, int w) {length = l; width = w;}
    public Rectangle(Rectangle other) {length = other.length; width = other.width;}

    //Default
    public Rectangle() {};
    public void setLength(int x) {this.length = x;}
    public void setWidth(int x) {this.width = x;}

    public boolean equals(Rectangle other)
    {
        return (this.width == other.width && this.length == other.length);
    }

    public int getLength() {return this.length;}
    public int getWidth() {return this.width;}

    public int area()
    {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}
