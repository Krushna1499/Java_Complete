package Day4;

public class CalculationTask {
	
	 int sum (int x,int y)
	{
		return x+y;
		
	}
	
	 int sum(int x,int y,int z)
	{
		
		return x+y+z;
	}
	double sum(double x,double y) {
		return x+y;
	}
	double sum(double x,double y,double z)
	{
		return x+y+z;
	}
	
	public static void main(String[] args) {
		CalculationTask cal =new CalculationTask();
		int result=cal.sum(15, 20,30);
		int result1=cal.sum(200, 100);
		double result2=cal.sum(10.5, 11.3);
		double result3=cal.sum(33.1, 21.2, 10);
		System.out.println("Result1: "+result);
		System.out.println("Result2: "+result1);
		System.out.println("Result3: "+result2);
		System.out.println("Result4: "+result3);

	}

}
/*q.
 * create a class calculation with the following methods 
 * int sum(int x,int y) should accept two integer parameters and 
 * returns sum of two numbers, now create object for calculation class 'cal' 
 * then call different methods by passing different inputs
*/
