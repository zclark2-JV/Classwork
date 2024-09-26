import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classwork924 {

	public static void main(String[] args) {
		int numVal;
		double sum = 0;
		List<Double> numBank=new ArrayList<Double>();
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter as many numbers as you'd like!\nHow many would you like to enter? ");
		numVal=reader.nextInt();
		System.out.println("Enter Values Here: ");
		while (numVal>=1) {
			numBank.add(reader.nextDouble());
			numVal-=1;
		}
		for (double num : numBank) {
			sum+=num;
		}
		System.out.println("This is the sum of your entereed valuess: "+sum);
	}

}
