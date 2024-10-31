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
		
		Scanner inFile = new Scanner("/Users/zac/git/Classwork/ConnectToGit/src/studentData");
		PrintWriter outFile=new PrintWriter("/Users/zac/git/Classwork/ConnectToGit/src/studentDataResults");
		
		while (inFile.hasNext()) {
			firstName=inFile.next();
			lastName=inFile.next();
			testScore=inFile.nextDouble();
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
				grade='E';
				break;
			case 7:
				grade='D';
				break;
			case 8:
				grade='C';
				break;
			case 9:
				grade='B';
				break;
			case 10:
				grade='A';
				break;
			default:
				System.out.println("Invalid Score");
			}
			outFile.print(grade);
		}
		outFile.close();
		inFile.close();

	}

}
