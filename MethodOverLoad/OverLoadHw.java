public class OverLoadHw {
    public static void convert(float a)
    {
        System.out.println(a);
    }
     public static void convert(char b)
      {
        System.out.println(b);
    }
     public static void  convert(double c)
     {
        System.out.println(c);
     }
         
     public static void main(String[] args) {
        OverLoadHw.convert(25.5d);
        OverLoadHw.convert('6');
        OverLoadHw.convert(2f); 
      }
    public static void allConvert(float a,char b,double c)
    {
        int x=(int)a;
        int y=(int)b;
        int z=(int)c;  
    }

}

