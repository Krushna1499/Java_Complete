package Day1;

public class operators {

	public static void main(String[] args) {
	
		int a =10;
		int b=20;
		
		// arithmetic operators ---> + - * / %
		
		System.out.println("Sum of a and b:"+(a+b));
		System.out.println("diff of a and b:"+(b-a));
		System.out.println("mul of a and b:"+(a*b));
		System.out.println("div of a and b:"+(a/b));
		System.out.println("mod of a and b:"+(a%b));
		
		// relational/coparison operators--> == < > <= >= !=
		//Always return boolean value
		System.out.println("------------comparison operators----------------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		
		//logical operators  && || !
		// works between two boolean
		boolean x=true;
		boolean y=false;
		System.out.println("------------logical operators----------------");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		//increment/decrement operators ++ --
		a=10;
		a++; //a=a+1
		//++a;
		System.out.println(a);
		b=20;
		//b=b-1;
		b--;
		System.out.println(b);
		
	// assignment operators  =
		//int a=10
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
