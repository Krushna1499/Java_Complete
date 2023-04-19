package Day5;

class Bike
{
	final void run() // final method, so we cannot override this method in child class
	{
		System.out.println("Runnig....");
	}
}
class Honda extends Bike
{
	//void run() //compile time error
	{
		System.out.println("Started.......");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
