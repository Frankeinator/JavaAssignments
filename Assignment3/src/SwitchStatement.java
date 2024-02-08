import java.util.Scanner;

public class SwitchStatement {
        public static void main(String[] args)
        {
            Scanner reader = new Scanner(System.in);
            System.out.print("How many books did you order: ");
            int num = reader.nextInt();
            int points = -1;

            switch (num) {
                case 0:
                    points = 0;
                    break;
                case 1:
                    points = 5;
                    break;
                case 2:
                    points = 15;
                    break;
                case 3:
                    points = 30;
                    break;
                default:
                    points = 60;
                    break;

            }

            System.out.println("You earned " + points + " points.");
        }
}
