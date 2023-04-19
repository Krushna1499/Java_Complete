package Day5;

class Teacher{
	String designation ="Teacher";
	String collegeName ="Beginnersbook";
void does() {
	System.out.println("Teaching");
}
	
}

class ComputerTeacher extends Teacher
{
	
}


public class Task {

	public static void main(String[] args) {
		ComputerTeacher ct=new ComputerTeacher();
		ct.does();
		System.out.println(ct.collegeName);
		System.out.println(ct.designation);

	}

}

/* 
 * Assignment
 * create class teacher ehich contains following variables and methods
 * designation ="Teacher";
	collegeName ="Beginnersbook";
	does() --teaching
	
	create another class 'ComputerTeacher' which exteds 'Teacher' class then create objects
	then call methods
 * 
 * 
 * 
 * 
 * 
*/