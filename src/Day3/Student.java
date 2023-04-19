package Day3;

public class Student {

	int sid;
	String sname;
	char grade;
	
	Student(int id,String name,char g)// constructor
	{
		sid=id;
		sname=name;
		grade=g;
	}
	

	//using method --variable 
	void getValues(int id,String name,char g) { //method
		sid=id;
		sname=name;
		grade=g;
		
	}
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
}
