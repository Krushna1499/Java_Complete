package Day3;

public class CalculationTask {

	int s1;
	int s2;
	int s3;
	int sum;
	
	CalculationTask(int S1,int S2,int S3){
		
		s1=S1;
		s2=S2;
		s3=S3;
		
	}
	void sum()
	{
		sum=s1+s2+s3;
		
	}
	void display() {
		
		
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		CalculationTask ct = new CalculationTask(10, 15, 20);
		ct.sum();
		ct.display();

	}

}
