package Array;
import java.util.Scanner;

public class FloatScanner {
   
        public static void main(String[] args) {
            Scanner q=new Scanner (System.in);
            System.out.println("Enter the Size of Array");
            int size=q.nextInt();
            float arr[]=new float [size];
            System.out.println("Enter " + size + " values for Array");
            for (int i=0; i<size;i++)
    
            {
                arr[i]=q.nextFloat();
            }
            System.out.println("Array values");
            for(int i=0; i<=size-1; i++)
            {
                System.out.println(arr[i]);
            }
    
        }
    }

