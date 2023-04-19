package Day2;

public class Substring {

	public static void main(String[] args) {
		String s="Welcome";
		System.out.println(s.substring(1,3));
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(4,7));

		
	s="welcome";
	s="WELCOME";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	}

}

/*
 substring():Returns substirng of a string based on starting index and ending index.
  starting index -- 0 1 2 3 4 5 6
               S -- W E L C O M E
    Ending Index -- 1 2 3 4 5 6 7
    
   
 */