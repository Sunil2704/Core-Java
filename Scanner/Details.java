package Scanner;
import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String p=d.nextLine();
        Scanner e=new Scanner(System.in);
        System.out.println("Enter Your Last Name");
        String q=e.nextLine();
        Scanner f=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int r=f.nextInt();
        Scanner g=new Scanner(System.in);
        System.out.println("Enter Your Phone Number");
        long s=g.nextLong();
        Scanner h=new Scanner(System.in);
        System.out.println("Enter Your Address");
        String t=h.nextLine();
        System.out.print("Full Name--> " +p);
        System.out.println(q);
        System.out.println("Age--> "+r);
        System.out.println("Phone Number--> "+s);
        System.out.println("Address--> "+t);
     }

    
}
