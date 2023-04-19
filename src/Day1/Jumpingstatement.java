package Day1;

public class Jumpingstatement {

	public static void main(String[] args) {
	/*	for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i); //print only 1 2 3 4
		}
*/
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i); //print only 1 2 3 4 6 7 8 9 10
		}
	}

}
// break and continue these are the jumping statements