package Day3;

public class StudentTask {
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	int result;
	
	void getStuData(int id,String name)
	{			
		SID=id;
		Sname=name;
		
	}
	
	void getStuMarks(int Sub,int Subb,int Subj) 
	{
		Sub1=Sub;
		Sub2=Subb;
		Sub3=Subj;
		
	}
	void totalMarks() {
		
		result=Sub1+Sub2+Sub3;
		
	}
	void display() {
		System.out.println(SID+" "+Sname);
		System.out.println(Sub1+" "+Sub2+" "+Sub3);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		StudentTask St =new StudentTask();
		St.getStuData(101,"Krishna");
		St.getStuMarks(60, 70, 65);
		St.totalMarks();
		St.display();
		

	}

}
