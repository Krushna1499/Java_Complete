package Day6;
interface A3
{
	int a=10;
	int b=20;
	void sum();
	
}


public class Task implements A3 {
	public void sum()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Task t=new Task();
		t.sum();
				

	}

}
/* Write a program to demonstrate interface

* interface A3 :int a ,int b,sum()
class Task : implements method from A3 and calculate Sum of a and b
*
*
*/

