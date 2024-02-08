import java.io.*;
import java.util.Scanner;
public class NumberManagementSystem {//
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        int num, sum = 0, option = -1;
        while (true)
        {
            System.out.print("[1] Enter Numbers\n" +
                    "[2] Sum Numbers\n" +
                    "[3] Exit\n" +
                    "Input: ");
            option = reader.nextInt(); reader.nextLine();
            if (option == 3)
                break;

            //option 1
            if (option == 1)
            {
                try {
                    FileWriter outfile = new FileWriter("numbers.txt", false);
                    System.out.println("Enter numbers, type any negative number to quit.");
                    while(true) {
                        System.out.print("Input number: ");
                        num = reader.nextInt();
                        reader.nextLine();

                        if (num >= 0) {
                            outfile.write(num + "\n");
                        } else {
                            outfile.close();
                            break;
                        }
                    }
                }
                catch (IOException e)
                {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
            //option 2
            else if (option == 2)
            {
                try {
                    File fileobj = new File("numbers.txt");
                    Scanner fileReader = new Scanner(fileobj);
                    sum = 0;
                    while (fileReader.hasNext()) {
                        sum += fileReader.nextInt();
                    }

                    System.out.println("Sum of numbers: " + sum);
                    fileReader.close();
                } catch (IOException e)
                {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
            System.out.print("\n\n\n\n");
        }

    }
}
