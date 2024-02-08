import java.io.*;
import java.util.Scanner;


public class StudentGPA {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("./students.txt");
        Scanner reader = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter student ID and GPA. Type -1 for ID to quit.");
            System.out.print("Student ID: ");
            int id = reader.nextInt(); reader.nextLine();
            if (id == -1)
                break;
            System.out.print("Student GPA: ");
            float gpa = reader.nextFloat(); reader.nextLine();

            outputFile.print(id);
            outputFile.print(" ");
            outputFile.print(gpa);
            outputFile.println();
        }
        outputFile.close();
        System.out.println("BYE BYE");
    }
}
