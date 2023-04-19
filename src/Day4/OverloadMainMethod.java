package Day4;

public class OverloadMainMethod {
	
	
	public void main(int x) //1
	{
		System.out.println(x);
	}
	public void main(int x,int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// yes,we can overload main method again and again-- it is interview question
		OverloadMainMethod om=new OverloadMainMethod();
		om.main(100); //1st main method
		om.main(110, 200); //2nd main method
	} 

}
