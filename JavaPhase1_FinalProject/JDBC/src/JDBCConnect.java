import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnect 
{

	public static void main(String[] args) 
	{
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mytrgdb",
				"root",
				"root");
		
		System.out.println("Database connected");
		} catch(ClassNotFoundException | SQLException e) 
		{
		e.printStackTrace();
		}
	}
}
