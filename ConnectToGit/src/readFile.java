import java.util.*;
import java.io.*; //IO Input and Output
public class readFile {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Current working directory: " + System.getProperty("user.dir"));

		Scanner inFile = new Scanner(new FileReader("payroll.txt"));
		String firstName;
		String lastName;
		double wages;
		double hoursWorked;
		double payRate;
		
		firstName=inFile.next();
		lastName=inFile.next();
		hoursWorked=inFile.nextDouble();
		payRate=inFile.nextDouble();
		inFile.close();
		wages=hoursWorked*payRate;
		System.out.println(firstName+" "+lastName+" Wages: $"+wages);
	}

}
