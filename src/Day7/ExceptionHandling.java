package Day7;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progres");
		/*int a=100;
		try {
		System.out.println(a/0);  //throw Arithmetic Exception
		//any integer number divided by 0/zero then it perform Arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered in to catch block");
		}*/
		
		
		String s=null;
		try
		{
	      System.out.println(s.length()); //throws NullpointerException
		}
		catch(Exception e)
		{
			System.out.println("Entered in to catch block");
		}
		
		
		String x="abc";
		//int i=Integer.parseInt(x); //NumberFormatException
		
		//int arr[] =new int[5];
		//arr[10]=100;
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
