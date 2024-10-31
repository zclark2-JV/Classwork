import java.util.*;
import java.io.*;
public class readWrite {

	public static void main(String[] args) throws FileNotFoundException {
		String firstName;
		String lastName;
		double testScore;
		char grade=' ';
		double classAverage;
		double sum=0;
		int count=0;
		
		Scanner inFile = new Scanner(new FileReader("/Users/zac/git/Classwork/ConnectToGit/src/studentData"));
		PrintWriter outFile=new PrintWriter(new PrintWriter("/Users/zac/git/Classwork/ConnectToGit/src/studentDataResults"));
		
		while (inFile.hasNext()) {
			firstName=inFile.next();
			lastName=inFile.next();
			testScore=inFile.nextDouble();
			count++;
			sum+=testScore;
			switch((int)testScore/10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				grade='F';
				break;
			case 6:
				grade='D';
				break;
			case 7:
				grade='C';
				break;
			case 8:
				grade='B';
				break;
			case 9:
			case 10:
				grade='A';
				break;
			default:
				System.out.println("Invalid Score");
			}
			outFile.printf("%-12s %-12s %.2f %c %n", firstName, lastName, testScore, grade);
		}
		outFile.println();
		if(count!=0)
			outFile.printf("Class Average %.2f %n", sum/count);
		else
			outFile.println("No Data");
		outFile.close();
		inFile.close();

	}

}
