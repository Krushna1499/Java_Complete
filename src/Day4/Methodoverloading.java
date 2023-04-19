package Day4;

public class Methodoverloading {
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,double b)
	{
	System.out.println(a+b);	 
	}
	
	void add(double a,double b)
	{
	System.out.println(a+b);	 
	}
	
	void add(int a,int b,int c)
	{
	System.out.println(a+b+c);	 
	}
	
	public static void main(String[] args) {
		Methodoverloading mo= new Methodoverloading();
		mo.add(10, 10);
        mo.add(10.5, 20.0);
        mo.add(10, 30,40);
        mo.add(10, 23.5);
	}

}
