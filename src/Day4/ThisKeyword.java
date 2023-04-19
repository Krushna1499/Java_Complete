package Day4;

public class ThisKeyword {
	
	int a,b;// instance variable or class varaibles
	
	void getValues(int a,int b) // method variables/external variable 
	{
		this.a=a;
		this.b=b;
	}
	void printValues() 
	{
	System.out.println(a);
	System.out.println(b);
	}

	public static void main(String[] args) {
		
          ThisKeyword th =new ThisKeyword();
            th.getValues(10,20);
            th.printValues();
	}

}
