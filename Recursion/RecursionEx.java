class RecursionEx
{
    public static void main(String[]args)
    {
        RecursionEx.display();
    }
      public static void display()
   {
    System.out.println("Welcome");
     RecursionEx.display();
   }   
}// output stack area overflow 
