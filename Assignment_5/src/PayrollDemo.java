import java.util.Scanner;
public class PayrollDemo {
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);
        Payroll emp = new Payroll();
        int[] hours = new int[7];
        double[] pay = new double[7];

        for (int i = 0; i < 7; i++)
        {
            System.out.print("Enter employee id " + emp.getEmployeeId(i) + " hours worked: ");
            hours[i] = r.nextInt(); r.nextLine();
            while (hours[i] < 0)
            {
                System.out.print("Hours cannot be negative, enter again: ");
                hours[i] = r.nextInt(); r.nextLine();
            }
            System.out.print("Enter employee id " + emp.getEmployeeId(i) + " pay rate: ");
            pay[i] = r.nextDouble(); r.nextLine();
            while (pay[i] < 6.0)
            {
                System.out.print("Pay cannot be less than 6.0, enter again: ");
                pay[i] = r.nextDouble(); r.nextLine();
            }
            System.out.println();System.out.println();
        }
        emp.setHours(hours);
        emp.setPayRate(pay);

        emp.calculateGross();
        for (int i = 0; i < 7; i++)
        {
            System.out.println("Employee " + emp.getEmployeeId(i) + " has made $" + emp.getEmployeeGross(emp.getEmployeeId(i)));
            System.out.println();
        }
    }
}

