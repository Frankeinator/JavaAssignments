public class Car {
    private int speed;
    private String model;
    private String color;
    private int year;

    public Car(){};
    public Car(int s, String m, String c, int y)
    {
        speed = s;
        model = m;
        color = c;
        year = y;
    }

    public void setSpeed(int s) { speed = s; }
    public int getSpeed() { return speed; }

    public void setModel(String m) { model = m; }
    public String getModel() { return model; }
    public void setColor(String c) { color = c; }
    public String getColor() { return color; }
    public void setYear(int y) { year = y; }
    public int getYear() { return year; }

    public void accelerate(int inc) { speed += inc; System.out.println("Speed = " + speed); }
    public void brake(int dec) { speed -= dec; System.out.println("Speed = " + speed); }
}
