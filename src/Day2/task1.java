/*package Day2;

public class task1 {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500};
		//System.out.println(a[2]); // 1)reading the specific values
		int sum = 0;
		
		// calculate sum of values in array 
		for(int i=0;i<a.length;i++)
		{
			sum= sum+a[i];
			
		}
		System.out.println("sum of all array number is: "+sum);
	}

}
// concating two strings
package Day2;

public class task1 {

	public static void main(String[] args) {
		String s ="Welcome";
		String s1=" Janni";
		{
			System.out.println(s.concat(s1));
		}
		
	}
}

// define an array with some string values write a java program search specific string in ana array 
package Day2;

public class task1 {

	public static void main(String[] args) {
		
		
	String a [] = {"Apple","Banana","Orange","Grapes","Carrot"};
	{
		System.out.println(a[1]);
	}
		
	}
	

	}

// write a program to print even and odd number in array
package Day2;

public class task1 {

	public static void main(String[] args) {
 int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even number is:"+a[i]);
			}
			else
			{
				System.out.println("Odd numbers:"+a[i]);
			}
		}
		
		
	}
	
}


// write a program to find greatest and smallest element in an array
package Day2;

public class task1 {

	public static void main(String[] args) {
 int a[]= {55,40,69,78,32,12,65,98,41};
 int smallest= a[0] ;
 int largest = a[0];
 for(int i=1;i<a.length;i++)
 {
	 if(a[i]>largest)
	 largest=a[i];
	 else if(a[i]<smallest)
		 smallest =a[i];
 }
 System.out.println("smallest number is: "+smallest);
 System.out.println("Largest number is: "+largest);
 
 {
	 
 }

	}
	
}
*/

// write a program to add two matrices
package Day2;

public class task1 {

	public static void main(String[] args) {
		//int a[][]= new int[4][3];
		/*a[0][0]=10;
		a[0][1]=15;
		a[0][2]=20;
		
		a[1][0]=12;
		a[1][1]=9;
		a[1][2]=4;
		
		a[2][0]=21;
		a[2][1]=18;
		a[2][2]=13;
		
		a[3][0]=16;
		a[3][1]=12;
		a[3][2]=11;
		*/
		int a1[][]= {{10,15,20},{12,9,4},{21,18,13}};
		int a2[][]= {{12,15,10},{4,9,12},{18,13,21}};
		int a[][]=new int[3][3];	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=a1[i][j]+a2[i][j];
				System.out.println(" "+a[i][j]);
				
			}
				
			System.out.println(); //new line
			
		}
		

	}
}












