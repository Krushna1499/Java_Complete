package Day5;

public class FinalVariable {
	
	final int speed=40; // final variable, so we cannot change this value


	public static void main(String[] args) {
	FinalVariable fv=new FinalVariable();
	//fv.speed=100;
	System.out.println(fv.speed);
	}

}
