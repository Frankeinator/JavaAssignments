public class Car {
    private static int count = 0;
    private int speed;
    private String model;
    private String color;
    private int year;

    public Car(){count++;};
    public Car(int s, String m, String c, int y)
    {
        speed = s;
        model = m;
        color = c;
        year = y;
        count++;
    }
    public static int getCount() { return count; }

    public void setSpeed(int s) { speed = s; }
    public int getSpeed() { return speed; }

    public void setModel(String m) { model = m; }
    public String getModel() { return model; }
    public void setColor(String c) { color = c; }
    public String getColor() { return color; }
    public void setYear(int y) { year = y; }
    public int getYear() { return year; }

    public void accelerate(int inc) { speed += inc; System.out.println(this.getModel() + "'s speed = " + speed); }
    public void brake(int dec) { speed -= dec; System.out.println(this.getModel() + "'s speed = " + speed); }
}