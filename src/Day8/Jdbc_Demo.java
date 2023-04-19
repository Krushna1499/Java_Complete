package Day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *  1) create a connection
 2) create a query/statement
 3) Execute statement/query
 4) close connection
 */

public class Jdbc_Demo {

	public static void main(String[] args) throws SQLException {
		//create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbb","root","123456");
		//2) create a query/statement
		Statement stmt=con.createStatement();
		
		//String s="INSERT INTO STUDENT VALUES(103,'Smith')";
		//String s="UPDATE STUDENT SET SNAME='David' WHERE SID=103";
		String s="DELETE FROM STUDENT WHERE SID=103";
		
		//3) Execute statement/query
		
		stmt.execute(s);
		
		//close connection
		con.close();
		System.out.println("QUERY EXECUTED...");
		
	}

}
