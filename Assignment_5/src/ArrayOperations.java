public class ArrayOperations {
    public static int getTotal(int[][] arr)
    {
        int t = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                t += arr[i][j];

        return t;
    }

    public static int getAvg(int[][] arr)
    {
        int t = arr.length + arr[1].length;
        int s = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                s += arr[i][j];

        return s / t;
    }

    public static int getRowTotal(int[][] arr, int index)
    {
        int t = 0;
        for (int i = 0; i < arr[index].length; i++)
            t += arr[index][i];
        return t;
    }

    public static int getColumnTotal(int[][] arr, int index)
    {
        int t = 0;
        for (int i = 0; i < arr.length; i++)
            t += arr[i][index];
        return t;
    }

    public static int getHighestInRow(int[][] arr, int index)
    {
        int highest = arr[index][0];
        for (int i = 1; i < arr[index].length; i++)
            if (arr[index][i] > highest) highest = arr[index][i];

        return highest;
    }

    public static int getLowestInRow(int[][] arr, int index)
    {
        int lowest = arr[index][0];
        for (int i = 1; i < arr[index].length; i++)
            if (arr[index][i] < lowest) lowest = arr[index][i];

        return lowest;
    }
    public static void main(String[] args)
    {
        int[][] arr = new int[][]{
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 22, 3, 3},
                {4, 4, 1, 4, 4},
                {5, 5, 5, 5, 5},
                {6, 6, 1, 6, 6}
        };

        System.out.println(getTotal(arr));
        System.out.println(getAvg(arr));
        System.out.println(getRowTotal(arr, 5));
        System.out.println(getColumnTotal(arr, 3));
        System.out.println(getHighestInRow(arr, 2));
        System.out.println(getLowestInRow(arr, 3));

    }
}
