import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mytrgdb",
				"root",
				"root");
		
		// Insert as preparedStatement
		/*String query = "insert into studentdata values(?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, 110);
		preparedStatement.setString(2,"Radha");
		preparedStatement.setString(3,"Sinha");
		preparedStatement.setInt(4,10);
		preparedStatement.setString(5,"A+");
		
		int val = preparedStatement.executeUpdate();
		if (val>0)
			System.out.println("Record inserted");
		else
			System.out.println("Record not inserted");*/
		
		
		//update s preparedStatement
		/*String query = "update studentdata set standard = ? where roll_no = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, 300);
		preparedStatement.setInt(2, 110);
		
		int val = preparedStatement.executeUpdate();
		if (val>0)
			System.out.println("Record updated");
		else
			System.out.println("Record not updated");*/
		
		//delete as preparedStatement
		String query = "delete from studentdata where roll_no = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, 103);
		
		int val = preparedStatement.executeUpdate();
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
