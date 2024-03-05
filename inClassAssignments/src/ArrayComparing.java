import java.util.Scanner;

public class ArrayComparing {
    public static void equalArr(int[] arr, int[] arr2)
    {
        if(arr.length == arr2.length)
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] != arr2[i]) {
                    System.out.println("Not Equal");
                    return;
                }
            }
        else {
            System.out.println("Not equal");
            return;
        }
        System.out.println("Equal");
    }

    public static void fillArray(int[] arr)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 5 ints for array: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = reader.nextInt(); reader.nextLine();
        }
    }

    public static void main(String[] args){
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        fillArray(arr1);
        fillArray(arr2);

        equalArr(arr1, arr2);
    }
}
