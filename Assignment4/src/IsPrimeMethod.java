public class IsPrimeMethod {
    public static boolean isPrime(int n)
    {
        boolean ret = true;
        if (n > 1)
        {
            for (int i = 2; i < (n/2); i++)
            {
                if (n % i == 0) {
                    ret = false;
                    break;
                }
            }
        }
        else
            ret = false;
        return ret;
    }
    public static void main(String[] args)
    {
        int n = 8;
        boolean ret = isPrime(n);
        System.out.print(ret);
    }
}
