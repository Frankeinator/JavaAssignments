public class CelsiusTemperatureTable {
    public static double celsius(int f)
    {
        return (5.0 / 9.0) * (f - 32.0);
    }
    public static void main(String[] args)
    {
        for (int i = 0; i <= 20; i++)
        {
            System.out.println(celsius(i));
        }
    }
}
