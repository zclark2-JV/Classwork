import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class readArray2Play {

	public static void main(String[] args)throws IOException {
		//setup code and lists
		Scanner reader=new Scanner(System.in);
		List<String> listOfStrings=new ArrayList<String>();
		listOfStrings=Files.readAllLines(Paths.get("/Users/zac/git/Classwork/ConnectToGit/src/Books"));
		//I figured out that added "true" to the end enables append mode for PrintWriter
		PrintWriter outFile=new PrintWriter(new FileWriter("/Users/zac/git/Classwork/ConnectToGit/src/Books", true));
		String[] array=listOfStrings.toArray(new String[0]);
		
		//obtain user input
		System.out.println("Enter the title: ");
		String book=reader.nextLine();
		System.out.println("Enter the author: ");
		String author=reader.nextLine();
		System.out.println("Enter the genre: ");
		String genre=reader.nextLine();
		System.out.println("Enter the quantity: ");
		int quantity=reader.nextInt();
		System.out.println("Enter the price: ");
		double price=reader.nextDouble();
		
		//add to array and text file *CLASSWORK ONLY SAYS TO ADD TO DOC BUT I FIGURED I'D BUILD ON WHAT WE DID FOR THE LESSON*
		String newEntry =book+", "+author+", "+genre+", "+quantity+", "+price;
		listOfStrings.add(newEntry);
		
		outFile.println(newEntry);
		outFile.close();
		
		//print updated array
		for (String eachString : listOfStrings) {
			System.out.println(eachString);
		}
	} 	
}

