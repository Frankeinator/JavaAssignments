import java.util.Scanner;
public class IfElseIfStatements {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many books did you order: ");
        int num = reader.nextInt();
        int points = -1;
        if (num == 0)
            points = 0;
        else if (num == 1)
            points = 5;
        else if (num == 2)
            points = 15;
        else if (num == 3)
            points = 30;
        else if (num >= 4)
            points = 60;

        System.out.println("You earned " + points + " points.");
    }
}
