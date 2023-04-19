 package Day5;
  
 class AA 
 {
	 int a;
	 void display()
	 {
		 System.out.println(a);
	 
	 }
	 }
 class BB extends AA
 {
	 int b;
	void print()
	 {
		 
	 System.out.println(b);
	 }
	
	 }
 class C extends BB
 {
	int c;
	void show()
	{
		System.out.println(c);
	}
 }

public class MultilevelInheritance {

	public static void main(String[] args) {
		C cobj =new C();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		cobj.display();
		cobj.print();
		cobj.show();
		
		
	}

}
