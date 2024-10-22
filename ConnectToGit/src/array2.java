import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		String[] students={"Anne", "Bob", "Charlie"};
		int[] grades= {100, 98, 67};
		System.out.println("Whos grade do you need to lookup? ");
		String studentLookup=reader.nextLine();
		boolean foundStudent=false;
		for(int i=0;i<students.length;i++) {
			if (students[i].equals(studentLookup)) {
				System.out.println(grades[i]);
				foundStudent=true;
			}
			if (!foundStudent) {
				System.out.println("The student is not in this class!");
			}
		
		}
	}
}
