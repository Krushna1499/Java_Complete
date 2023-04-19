package Day6;
interface ABCc
{
	int a=10;
	int b=20;
	void add();
}
interface XYZz
{
	int x=10;
	int y=10;
	void mul();
}


public class Task2 implements ABCc,XYZz{
	public void add()
	{
		System.out.println(a+b);
	}
	public void mul()
	{
		System.out.println(x*y);
	}
	

	public static void main(String[] args) {
		Task2 t=new Task2();
		t.add();
		t.mul();

	}

}

/* Q. write a program for multiple inheritance by using interface
 *  interface A: int a,int b add()
 *  interface B: int x,int y mul()

 *  class :implements methods from A and B interfaces.
 */
