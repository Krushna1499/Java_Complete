package Day2;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][]=new int[3][2];
       
    		   a[0][0]=100;
    		   a[0][1]=200;
    		   
    		   a[1][0]=300;
    		   a[1][1]=400;
    		   
    		   a[2][0]=500;
    		   a[2][1]=600;
    		  // int a[][]={{100,200},{300,400},{500,600}};
    		   System.out.println("Number of rows:"+a.length);
                System.out.println("Number of column:"+a[0].length);
       /*
        * nested loops
                for(int i=0;i<a.length;i++) //outer loop
                {
                	for(int j=0;j<a[i].length;j++) // inner loop
                	{
                		System.out.println(a[i][j]);
                	}
                }*/
                
                //enhanced for loop
                for(int r[]:a)
                {
                	for(int i:r) {
                		System.out.println(i);
                	}
                }
 
                         
	}

}
//a.length it shows rows
//a[0].length it shows column
