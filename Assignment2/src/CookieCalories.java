import java.util.Scanner;
public class CookieCalories {
    public static void main(String[] args)
    {
        float calsPerCookie = 300f / 4f;
        Scanner reader = new Scanner(System.in);
        System.out.print("How many cookies did you eat? ");
        int ate = reader.nextInt(); reader.nextLine();
        float eatenCals = calsPerCookie * ate;
        System.out.println("You consumed " + eatenCals + " calories after eating " + ate + " cookies.");

    }
}
