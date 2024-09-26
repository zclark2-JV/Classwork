import java.util.Scanner;

public class clockDriver {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		clock myClock=new clock();
		clock yourClock=new clock(3,4,5);
		myClock.setTime(1,  2, 3);
	}

}
