import java.util.Scanner;
public class MaleAndFemalePercentages {
    public static void main(String[] args)
    {
        int males, females, total;
        Scanner reader = new Scanner(System.in);
        System.out.print("How many males? ");
        males = reader.nextInt();

        System.out.print("How many females? ");
        females = reader.nextInt();

        total = females + males;

        float percentageM = (float)males / total * 100;
        float percentageF = (float)females / total * 100;
        System.out.println("Percentage of males: " + percentageM + "% and percentage of females: " + percentageF + "%.");


    }
}
