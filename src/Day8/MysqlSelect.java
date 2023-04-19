package Day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *  1) create a connection
 2) create a query/statement
 3) Execute statement/query
 4) Store data in resultset
 5) close connection
 */

public class MysqlSelect {

	public static void main(String[] args) throws SQLException {
		//create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbb","root","123456");
		//2) create a query/statement
		Statement stmt=con.createStatement();
		
		//String s="INSERT INTO STUDENT VALUES(103,'Smith')";
		//String s="UPDATE STUDENT SET SNAME='David' WHERE SID=103";
		//String s="DELETE FROM STUDENT WHERE SID=103";
		
		String s="SELECT SID,SNAME FROM STUDENT";
		
		
		//3,4) Execute statement/query & STORE DATA IN RESULTSET
		
	ResultSet rs=stmt.executeQuery(s);
	
	while(rs.next()) //we dont know the how many rcords in the database thats why we while in it
	{
		int sid=rs.getInt("SID");
		String sname=rs.getString("SNAME");
		System.out.println(sid+" "+sname);
	}
		
		//5) close connection
		con.close();
		System.out.println("QUERY EXECUTED...");
		
	}

}
