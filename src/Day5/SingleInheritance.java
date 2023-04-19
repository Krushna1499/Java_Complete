 package Day5;
 
 class A  //parent
 {
	 int a;
	 void display()
	 {
		 System.out.println(a);
	 
	 }
	 }
 class B extends A // B is child class,A is parent class
 {
	 int b;
	void print()
	 {
		 
	 System.out.println(b);
	 }
	
	 }
 

public class SingleInheritance {

	public static void main(String[] args) {
		/*A aobj = new A();
		aobj.a=10;
		aobj.display();
		*/
		B bobj = new B();
		bobj.a=10; //A
		bobj.b=20; //B
		 
		bobj.display(); //A
		bobj.print(); 
	}

}
