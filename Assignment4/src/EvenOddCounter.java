import java.util.Random;
public class EvenOddCounter {
    public static boolean isEven(int n)
    {
        return n % 2 == 0;
    }
    public static void main(String[] args)
    {
        Random r = new Random();
        int e = 0, o = 0;
        for (int i = 0; i < 100; i++)
        {
            if (isEven(r.nextInt())) e++;
            else o++;
        }
        System.out.println("Even numbers: " + e + "\nOdd numbers: " + o);
    }
}
