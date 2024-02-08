import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuessingGame {
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int r = rand.nextInt(max - min) + min;
        int guess;
        System.out.print("Guess a number between 1 and 100, inclusive: ");
        //System.out.print("ans = " + r + "):");
        do {
            guess = reader.nextInt();

            if (guess < r)
                System.out.print("Too low... guess again: ");
            else if (guess > r)
                System.out.print("Too high... guess again: ");
            else
                System.out.println("Correct!");
        }while (guess != r);
    }
}
