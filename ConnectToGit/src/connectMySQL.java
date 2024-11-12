import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class connectMySQL {
	
	
    public static void main(String[] args) throws Exception {
    	// Initialize scanner and load the MySQL JDBC driver
    	Scanner scanner = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/books", "root", "root");
        System.out.println("Connection created");

        // Prepare and execute the SQL query
        PreparedStatement statement = con.prepareStatement("SELECT * FROM books");
		ResultSet result = statement.executeQuery();
		
		// To print everything in one while loop, we need MetaData (help from google) and the amount of columns (atm it's 5)
		ResultSetMetaData metaData = result.getMetaData();
		int columnCount = metaData.getColumnCount();
		
		// While statement to simplify the process of printing
		while (result.next()) {
			for (int i=1; i <= columnCount; i++) {
				System.out.print(result.getString(i) + " ");
			}
			System.out.println();
		}
		result.close();
		statement.close();
		con.close();
		scanner.close();
    }
}