package Day3;

public class StudentMain {

	public static void main(String[] args) {
//3.assign value by using constructor
		Student stu1=new Student(1010,"Krishna",'A');
		// 1.assign values by using reference variable
		/*stu1.sid=1010;
		stu1.sname="Krishna";
		stu1.grade='A';*/
		
		//2 assign values by using method
		/*stu1.getValues(1010, "Krishna", 'A');*/
		stu1.display();

	}

}