import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;

public class RandomStuff {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile = new PrintWriter("Names.txt");
        outputFile.println("Chris");
        outputFile.println("Kathryn");
        outputFile.println("Jean");
        outputFile.close();
    }
}
