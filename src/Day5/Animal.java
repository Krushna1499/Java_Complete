package Day5;

public class Animal {
	
	String color="White";
	void eating()
	{
		System.out.println("Eating.......");
	}
	Animal() //constructor
	{
		System.out.println("Animal is created");
	}

}

class Dog extends Animal
{
	String color="Black";
	Dog() //constructor
	{
		super(); //3 invokes parent class constructor
		System.out.println("Dog is created...");
		
	}
	
	/*void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color); // super keyword--1
	}*/
	/*void eating() {
		System.out.println("Eating Bread.....");
		super.eating(); //2
	}*/
	
}
//it show immediate class value