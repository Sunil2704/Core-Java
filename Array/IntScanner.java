package Array;
import java.util.Scanner;

public class IntScanner {
    public static void main(String[] args) {
        Scanner n=new Scanner (System.in);
        System.out.println("Enter the Size of Array");
        int size=n.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter " + size + " values for Array");
        for (int i=0; i<size;i++)

        {
            arr[i]=n.nextInt();
        }
        System.out.println("Array values");
        for(int i=size-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }

    }
    
}
