import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("How many items do you have for the list?");
		int num = reader.nextInt();
		String[] list=new String[num];
		for(int i=0;i<list.length;i++) {
			System.out.println("Please enter the name of item "+(i+1)+": ");
			list[i]=reader.next();
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("Here is your list of items: ");
			System.out.println(list[i]+ " ");
		}
		System.out.println("\n");
		int[] listA = {5, 7, 10, 12, 15};
		System.out.println(listA[1]);
	}

}
