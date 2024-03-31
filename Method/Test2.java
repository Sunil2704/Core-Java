public class Test2 {
    public static void main(String[] args) {

        int n= 29;
    int r=n%10;
    int q=n/10;
    int sum=r+q+r*q;
    if (sum==n)
    {
    System.out.println("Special two Digit Number");
    }
    else
    {
        System.out.println("Not a Special two digit Number");
    }

    }
}

