import java.security.SecureRandom;
import java.util.*;

public class linearSearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();
		int[]data = new int[30];
		for(int i=0; i<data.length; i++) {
			data[i]=10+generator.nextInt(90);
			//System.out.println(data[i]);
			//System.out.printf("%s%n%n", Arrays.toString(data));
		}
		System.out.printf("%s%n%n", Arrays.toString(data));
		
		System.out.println("Please enter an integer value (-1 to quit): ");
		int searchInt = input.nextInt();
		if (!(searchInt == -1)) {
			while (searchInt!=-1) {
				int position = linearSearch(data, searchInt);
				if (position==-1) {
					System.out.printf("%d was not found%n%n", searchInt);
					break;
				} else {
					System.out.printf("%d was found in %d%n%n", searchInt, position);
					break;
				}
			}
		} else {
			System.out.println("stop playing");
		}
	}
	
public static int linearSearch(int data[], int searchKey) {
	for (int index=0;index<data.length;index++) {
		if (data[index]==searchKey) {
			return index;
		}
	}
	return -1;
}

}
