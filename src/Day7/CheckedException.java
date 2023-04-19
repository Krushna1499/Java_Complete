package Day7;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException   {
		System.out.println("Program started");
		System.out.println("Program is in progress");
		
		/*try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			
		}*/
		
		Thread.sleep(5000);
		
        System.out.println("Program is Completed");
        System.out.println("Program is exited");
	}

}
