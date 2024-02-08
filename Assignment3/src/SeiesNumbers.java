public class SeiesNumbers {
    public static void main(String[] args)
    {
        float sum = 0f;
        for (float i = 1f, j = 30f; i < 31 && j > 0; i++, j--)
        {
            sum += (i / j);
        }
        System.out.println("Sum: " + sum);
    }
}//
