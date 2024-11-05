// import necessary packages
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bookData {
	// include throws to handle some file handling exceptions
	public static void main(String[] args)
		throws IOException
	{
		// arraylist to store strings
		List<String> listOfStrings
			= new ArrayList<String>();
	
		// load content of file based on specific delimiter
		Scanner sc = new Scanner(new FileReader("/Users/zac/git/Classwork/ConnectToGit/src/Books"))
						.useDelimiter("\r\n");
		String str;
	
		// checking end of file
		while (sc.hasNext()) {
			str = sc.next();
		
			// adding each string to arraylist
			listOfStrings.add(str);
		}
	
		// convert any arraylist to array
		String[] array
			= listOfStrings.toArray(new String[0]);
	
		// print each string in array
		for (String eachString : array) {
			System.out.println(eachString);
		}
	}
}
