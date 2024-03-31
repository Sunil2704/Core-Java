package Scanner;
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter Your Age-->");
        int b=a.nextInt();
        if(b>=60)
        {
            System.out.println("You Are Senior Citizen");
        }
        else
        {
            System.out.println("Your Are Under Age");
        }


    }
    
}
