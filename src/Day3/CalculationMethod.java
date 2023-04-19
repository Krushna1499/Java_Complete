package Day3;

public class CalculationMethod {
	
	int x=10;
	int y=20;
	
	/*void sum() //case1-- not taking parameters and also not returned any value
	{
		
		System.out.println(x+y);
		
		
	}*/
	/*int sum() //case2-- not taking parameters but returning value
	{
		
		return (x+y);
		
		
	}
	*/
	
	/*void sum(int a ,int b) //case3-- taking parameters, but not returning any value
	{
		
		System.out.println(a+b);
		
		
	}*/
	int sum(int a ,int b) //case4-- method is taking parameters and also returning a value.
	{
		
	return a+b;
		
		
	}
	public static void main(String[] args) {
		CalculationMethod cal=new CalculationMethod();
		//cal.sum(); //case1
		
		/*int res=cal.sum();//case2
		System.out.println(res);
		System.out.println(cal.sum()); // we can also write as in case2 and avoid temporary variable
		*/
		//cal.sum(100, 200);//case3
System.out.println(cal.sum(100,200)); //case4
	}

}
