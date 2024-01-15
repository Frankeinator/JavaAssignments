public class Diamond {
    public static void main(String[] args)
    {
        System.out.println("      *      \n    * * *     \n  * * * * *  \n* * * * * * *\n  * * * * *  \n    * * *     \n      *      \n");

        //For fun
        if(args.length > 0)
        {
            try
            {
                int n = Integer.parseInt(args[0]);

                for(int i = 1; i <= n; i++)
                {
                    for(int j = i; j < n; j++)
                    {
                        System.out.print("  ");
                    }
                    for(int j = 1; j <= (2*i-1); j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for(int i = n - 1; i >= 1; i--)
                {
                    for(int j = n; j > i; j--)
                    {
                        System.out.print("  ");
                    }
                    for(int j = 1; j <= (2*i-1); j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } catch(Exception e)
            {
                System.out.println("args[0] needs to be an integer...\n");
            }

        }
    }
}
