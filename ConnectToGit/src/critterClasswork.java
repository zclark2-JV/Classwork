import java.util.Scanner;

public class critterClasswork {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		critter myCritter=new critter();
		System.out.println("Wlecome to Critter Creator!\nEnter a Name: ");
		myCritter.setName(reader.next());
		System.out.println("Enter a Mood: ");
		myCritter.setMood(reader.next());
		System.out.println(myCritter);
		
	}

}
