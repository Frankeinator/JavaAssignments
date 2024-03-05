import java.util.Random;
public class addArray {
    public static int[][] addArrays(int[][] arr1, int[][] arr2)
    {
        int[][] ret = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                ret[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ret;
    }

    public static void printArray(int[][] arr1, int[][] arr2, int[][] retArray)
    {
        System.out.println("First original array: ");
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second original array: ");
        for (int i = 0; i < arr2.length; i++)
        {
            for (int j = 0; j < arr2[i].length; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Added array: ");
        for (int i = 0; i < retArray.length; i++)
        {
            for (int j = 0; j < retArray[i].length; j++)
            {
                System.out.print(retArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Random r = new Random();
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1[i].length; j++)
            {
                arr1[i][j] = r.nextInt(1, 11);
                arr2[i][j] = r.nextInt(1, 11);
            }
        }

        int[][] retArr = addArrays(arr1, arr2);
        printArray(arr1, arr2, retArr);
    }
}