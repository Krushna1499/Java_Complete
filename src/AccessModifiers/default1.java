package AccessModifiers;
class A1
{
	 int data=10;
	void m1() {
		System.out.println(data);
	}
}


public class default1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 aobj=new A1();
		aobj.data=20; //compile time error
		aobj.m1();
	}

}
