import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) 
	{
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mytrgdb",
				"root",
				"root");
		
		Statement statement = connection.createStatement();
		
		// insert record
		//String query = "insert into studentdata values(101, 'Ramlal', 'Sharma',10 ,'A+')";
		//String query = "insert into studentdata values(103, 'Shamlal', 'Verma',10 ,'A')";
		//String query = "insert into studentdata values(102, 'Silvia2', 'Berella',28 ,'A++')";
		//String query = "insert into studentdata values(102, 'Silvia', 'Berella',28 ,'A++')";
		//int val = statement.executeUpdate(query);
		/*if (val>0)
			System.out.println("Record inserted");
		else
			System.out.println("Record not inserted");*/
		
		//update record
		//String query = "update studentdata set standard = 11 where roll_no = '103'";
		//int val = statement.executeUpdate(query);
		
		//delete record
		String query = "delete from studentdata where roll_no = '102'";
		int val = statement.executeUpdate(query);
		/*if (val>0)
			System.out.println("Record updated");
		else
			System.out.println("Record not updated");*/
		
		//System.out.println("val: "+ val);
		if (val>0)
			System.out.println("Record deleted");
		else
			System.out.println("Record not deleted");
		
		} catch(ClassNotFoundException | SQLException e) 
		{
		e.printStackTrace();
		}
	}
}
