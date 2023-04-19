package Day4;

public class StaticExample {
	
	static int a=10; //static variable
	int b=20; //non static variable
	
	static void m1() { //static method
		System.out.println("this is m1 -static method");
	}
	
	void m2() { // non static method
		System.out.println("this is m2 -Non-static method");
		
	}
	void m3() {
		System.out.println("This is m3 method-- non-Static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		//static methods can access only static stuff
		//System.out.println(a);
		//m1();
		
// if the whole main method is an another class then we write as
		//(another class.variable/method name)
		// System.out.println(StaticExample.a);
		// StaticExample.m1();
		
		//System.out.println(b); Incorrect,bcoz b is non-static variable
		//m2(); incorrect, bcoz m2() is non-static method
		
	//static methods can also access non-static stuff but through object.	
		StaticExample se=new StaticExample();
		//System.out.println(se.b); //non static variable through object
		//se.m2(); //non static method through object
		
		se.m3();
		

	}

}
