import java.util.Scanner;
public class VerifyClassDemo {
    public static void main(String[] args)
    {
        VerifyClass a = new VerifyClass();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = reader.nextLine();

        if (a.isValid(password))
        {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid.");
        }
        reader.close();
    }
}
