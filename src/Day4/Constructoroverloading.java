package Day4;

public class Constructoroverloading {
	
	Constructoroverloading (int a, int b)
	{
		System.out.println(a+b);
	}
	
	Constructoroverloading(int a,double b)
	{
		System.out.println(a+b);
	}
	
	Constructoroverloading (int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	Constructoroverloading (double a, int b)
	{
		System.out.println(a+b);
	}
	
	
// constructor overloading means same class with same method name but different parameters
// one object can acquire only one method value
	public static void main(String[] args) {
		Constructoroverloading co=new Constructoroverloading(10,20);
		Constructoroverloading c=new Constructoroverloading(10,25,30);
		Constructoroverloading C=new Constructoroverloading(10.5,20);
		Constructoroverloading o=new Constructoroverloading(10,20.3);
	}

}
