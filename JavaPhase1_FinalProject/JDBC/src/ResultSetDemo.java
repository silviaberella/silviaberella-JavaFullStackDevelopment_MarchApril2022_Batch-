import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mytrgdb",
				"root",
				"root");
		
		String query = "select * from studentdata";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next())
		{
			//int rollNo = resultset.getInt(1);
			int rollNo = resultSet.getInt("roll_no");
			String firstName= resultSet.getString("first_name");
			String lastName= resultSet.getString("last_name");
			int standard = resultSet.getInt(4);
			String grade= resultSet.getString("grade");
		
		System.out.println("Roll.no: " + rollNo);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Standard: " + standard);		
		System.out.println("Grade: " + grade);
		System.out.println("**********************************************");
			
		}
		} catch(ClassNotFoundException | SQLException e) 
		{
		e.printStackTrace();
		}	
		
	}

}
