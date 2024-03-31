public class MethodOverLoad 
{
  
        public static void add(int a,int b)
        {
            System.out.println(a+b);
        }
        public static void add(int a,int b,int c )
        {
            System.out.println(a+b+c);
        }
        public static void add()
        {
            System.out.println("No Data Given");
        }
         public static void add(String a,String b)
        {
        System.out.println(a+b);

       }
        public static void main(String[] args) 
        {
        MethodOverLoad.add(70,30);
         MethodOverLoad.add();
          MethodOverLoad.add(70,30,70);
           MethodOverLoad.add("Sunil","Prasad");

        }
    }



