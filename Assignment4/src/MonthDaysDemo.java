import java.util.Scanner;
public class MonthDaysDemo {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int month;
        do {
            System.out.print("Enter a month: ");
            month = reader.nextInt();
            reader.nextLine();
        } while(month < 1 || month > 12);
        System.out.print("Enter a year: ");
        int year = reader.nextInt(); reader.nextLine();
        MonthDays md = new MonthDays(month, year);
        System.out.println(md.getNumberOfDays() + " days");


    }
}
