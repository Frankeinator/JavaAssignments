import java.util.Scanner;
public class BarChart {
    public static void main(String[] args)
    {
        //
        int sales[] = {0, 0, 0, 0, 0};
        Scanner reader = new Scanner(System.in);
        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Enter today's sales for store " + i + ": ");
            sales[i - 1] = reader.nextInt();
        }

        System.out.println("SALES BAR CHART");
        for (int i = 1; i <=5; i++)
        {
            System.out.print("Store " + i + ": ");
            for (int j = 0; j < sales[i - 1] / 100; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
