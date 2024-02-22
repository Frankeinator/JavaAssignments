import java.util.Scanner;
public class CircleDemo {
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = reader.nextDouble();
        c.setRadius(r);

        System.out.println("Area = " + c.getArea() + "\nDiameter = " + c.getDiameter() +
                "\nCircumference = " + c.getCircumference());

    }
}
