import java.util.Scanner;
public class StringOperationsDemo {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringOperations a = new StringOperations(reader.nextLine());

        while (true) {
            System.out.println("a. Count the number of vowels in the string");
            System.out.println("b. Count the number of consonants in the string");
            System.out.println("c. Count the number of vowels and consonants in the string");
            System.out.println("d. Enter another string");
            System.out.println("e. Exit the program");
            System.out.println("Choose an option: ");
            char option = reader.nextLine().charAt(0);
            switch (option)
            {
                case 'a':
                    System.out.println("Number of vowels: " + a.countVowels());
                    break;
                case 'b':
                    System.out.println("Number of consonants: " + a.countConsonants());
                    break;
                case 'c':
                    System.out.println("Number of vowels: " + a.countVowels());
                    System.out.println("Number of consonants: " + a.countConsonants());
                    break;
                case 'd':
                    System.out.println("Enter a string:");
                    a = new StringOperations(reader.nextLine());
                    break;
                case 'e':
                    System.out.println("Exiting.");
                    reader.close();
                    return;
                default:
                    System.out.println("Invalid option. Choose again.");
            }
        }
    }
}
