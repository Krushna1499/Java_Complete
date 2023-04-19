package Day7;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program started");
	    
		int a=100;
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{
		System.out.println("Entered in to catch block");	
		}
		finally
		{
			System.out.println("ENTERED INTO FINALLY BLOCK");
		}
		System.out.println("Program exited");

	}

}
