package Array;

public class FloatVSInt {
    public static void main(String[] args) {
        float f[]={45.12f,45f,63.25f,47.20f};
        System.out.println("Length of array "+f.length);
        for(int i=0;i<=f.length-1;i++)
        
        {
            int c=(int)f[i];
            System.out.println(c);
        }
        // System.out.println(i=(int)f[0]);
        // System.out.println(i=(int)f[1]);
        // System.out.println(i=(int)f[2]);
        // System.out.println(i=(int)f[3]);
        // System.out.println(i=(int)f[4]);
    }
}
