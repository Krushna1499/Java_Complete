package Day3;

public class Employeemain {
public static void main(String args[]) {
		
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Krishna";
		emp1.sal=35000.00;
		emp1.job="Manager";
		emp1.deptno=10;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="KrishnaLL";
		emp2.sal=55000.00;
		emp2.job="sr.Manager";
		emp2.deptno=20;
		emp2.display();
		
	}
}
// 2)main() method can be present in a separate class.