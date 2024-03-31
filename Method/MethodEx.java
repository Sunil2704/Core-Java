
public class MethodEx {
	public static void morning()
	{
		System.out.println("Good Morning ");
		MethodEx.noon();
		
	}
	public static void noon()
	{
		System.out.println("Noon");
	}
	public static void main(String[] args) {
		MethodEx.morning();
		System.out.println("Done");
	}
	}


