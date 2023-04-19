package Day5;

class Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}

class Child2 extends Parent
{
	int y;
	void print()
	{
		System.out.println(y);
	}
}


public class HierarchyInheritance {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.x=10;
		c1.a=100;
		c1.display();
		c1.show();
		Child2 c2=new Child2();
		c2.a=120;
		c2.y=300;
		c2.print();
		c2.display();
	}

}
