import java.util.Scanner;
public class RectangleArea
{

    public static double getLength()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter length: ");
        return reader.nextDouble();
    }

    public static double getWidth()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter width: ");
        return reader.nextDouble();
    }

    public static double getArea(double length, double width)
    {
        return length * width;
    }

    public static void displayData(double length, double width, double area)
    {
        System.out.println("Width: " + width +
                "\nLength: " + length +
                "\nArea: " + area);
    }
    public static void main(String[] args)
    {
        double length,    // The rectangle's length
                width,     // The rectangle's width
                area;      // The rectangle's area

        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user.
        width = getWidth();

        // Get the rectangle's area.
        area = getArea(length, width);

        // Display the rectangle data.
        displayData(length, width, area);
    }
}

