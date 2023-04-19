package Day3;

public class Constructor {
	
	int x;
	int y;
	
	
	Constructor() //default constructor
	{
        x=10;
        y=20;
	}
	Constructor(int a,int b) //parameterized constructor
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		Constructor c1 =new Constructor(); // invokes default constructor
		Constructor c2 =new Constructor(100,200); //invokes parameterized constructor
		c1.display();
		c2.display();

	}

}
