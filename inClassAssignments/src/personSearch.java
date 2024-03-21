import java.util.Scanner;
public class personSearch {
    public static void main(String[] args)
    {
        String[] names = new String[]{"Franke, Alex", "Franke, Will", "Alford Jesse", "Wilson, Sabrina", "Franke, Sabrina", "Keeney, Bethany"};
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter part of a last name: ");
        String last = reader.nextLine();
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].startsWith(last)) System.out.println(names[i]);
        }


    }
}