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
        
        // Asking what type of book to add!
        boolean addStatus;
        System.out.println("** WELCOME TO THE BOOK DATABASE **");
        System.out.println("Would you like to ADD a book? If not, we will show you our selection. (Y/N): ");
        
        String addOrView = scanner.nextLine();
        if (addOrView.equals("Y") || addOrView.equals("y")) {
        	addStatus = true;
        } else {
        	addStatus = false;
        }
        while (addStatus == true) {
        	System.out.println("Title: ");
			String bTitle = scanner.nextLine();
			System.out.println("Author: ");
			String bAuthor = scanner.nextLine();
			System.out.println("Genre: ");
			String bGenre = scanner.nextLine();
			System.out.println("Price: $");
			Double bPrice = scanner.nextDouble();
			System.out.println("Quantity: ");
			int bQuantity = scanner.nextInt();
			
	        // Inserts into the database!
			PreparedStatement insert = con.prepareStatement("INSERT INTO `books` (`title`, `author`, `genre`, `quantity`, `price`) VALUES (?, ?, ?, ?, ?)");
	        insert.setString(1, bTitle);
	        insert.setString(2, bAuthor);
	        insert.setString(3, bGenre);
	        insert.setDouble(4, bPrice);
	        insert.setInt(5, bQuantity);
	        insert.executeUpdate();
	        System.out.println("Added to the Database!");
	        System.out.println("\n"+"Would you like to add another? (Y/N): ");
	        String reRun = scanner.nextLine();
	        if (!reRun.equals("Y") || !reRun.equals("y")) {
	        	addStatus = false;
	        }
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
       }
	con.close();
	scanner.close();
    }
}