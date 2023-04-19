package Day2;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Welcome";
		String s1=" to Java";
		String s2="     Welcome  ";
		String s3 ="Krishna";
		String s4="Lavhare";
		
		System.out.println(s.length());
		System.out.println(s.concat(s1));
		System.out.println("Before triming:"+s2);
		System.out.println("After Trimming:"+s2.trim());
		System.out.println(s3.charAt(2));
		System.out.println(s4.contains("Lav"));

		// comparing stirng equals() and equalsIgnoreCase()	
				s="welcome";
				System.out.println(s.equals("Welcome"));
				System.out.println(s.equals("Wel   come"));
				System.out.println(s.equals("welcome"));
				
				System.out.println(s.equalsIgnoreCase("welcome"));
				
			// replacing the character
				s="Krishna";
				//System.out.println(s.replace('K', 'L'));
				System.out.println(s.replace("Krishna","Lavhare"));
				
				
				
				
				
				
			}

		}
/* Stirng : string is collection of characters
String s="Welcome" 

String methods
		--------------------------
		String s="Welcome" --s.length() this method count the total no. of characters

		String s="Welcome"
		String s1="To Java" --s.concat(s1) this method connect two sentences

		String s=" Welcome " -- s.trim() this method remove the spaces
		
		String s="Welcome" --s.charAt(3) returns a char value at the given index number 
		index starts from 0
		
		String s="Welcome" --s.contains("Wel") -- it searches sequence of characters in this stirng
		it returns true if sequence of char values are found in this string otherwise return false
		
		String s="Welcome" -- s.equals("Welcome") -- compares the two given strings based on the
		content of the string if any character is not matched 
		it returns false. if all characters are matched it returns true.
		String s="Welcome" --s.equals("welcome") -- it shows false
		
		equalsIgnoreCase(): Compares two string on the basis of content but it does not check the case like equlas()
		it ignore casesentivity
		String s="Welcome" -- s.equals("Welcome")
		
		String s="Welcome" --s.equalsIgnoreCase("Welcome") -- True
		String s="Welcome" --s.equalsIgnoreCase("welcome") -- True
		
		replace():returns a string,replacing all the old characters of CharSequence
		to new characters. there are two ways
		
		String s="Welcome" --s.replace('e','a') --walcoma
		String s="Welcome To Java" --s.replace("Java","Selenium")-- Welcome To Selenium
		
		
		
		
		
		
		*/
