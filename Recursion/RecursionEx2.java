public class RecursionEx2 {
    public static void main(String[] args) {
        RecursionEx2.verify(0);
    }
    public static void verify(int n)
    {
        n++;
        if (n<=6)
        {
            System.out.println("Do Verification By Checking pin");
            RecursionEx2.verify(n);
        }
        else
        {
            System.out.println("Timer Start");
        }
    }
}
