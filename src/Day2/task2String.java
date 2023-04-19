package Day2;

public class task2String {

	public static void main(String[] args) {
		// write a program to compare two strings, ignoring case differences
		//we using methods in this program like concat and equals etc
			
			String s="Welcome";
			String s1="welcome";
			String s2=" Janni";
			s="WELCOME";
			{
				System.out.println(s.equalsIgnoreCase(s1));
				System.out.println(s.concat(s2));
				System.out.println(s.length());
				System.out.println(s.substring(0,6));
				System.out.println(s1.toUpperCase());
				System.out.println(s.toLowerCase());
				
			}
			

	}

}
