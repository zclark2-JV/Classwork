import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class bookDatabase {
	
	
    public static void main(String[] args) throws Exception {
    	Scanner scanner = new Scanner(System.in);
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/books", "root", "root");
    }
}