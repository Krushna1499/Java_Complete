package Day6;

interface A
{
	int a=10; //by default variable interface are static and final
	
	void m1(); //abstract method,by default public
}

public class TestInterface implements A  {
	
	
		public void m1()
		{
			System.out.println(a);
		}
	
	public static void main(String[] args) {
		/*TestInterface Ti = new TestInterface();
		Ti.m1();*/ 
		
		// we can also write as 
		A a=new TestInterface();
		a.m1();

	}

}
