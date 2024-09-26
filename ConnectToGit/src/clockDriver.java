import java.util.Scanner;

public class clockDriver {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		clock myClock=new clock(4,5,6);
		clock yourClock=new clock(1,2,3);
		myClock.setTime(23,59,59);
		System.out.println(myClock.getHour());
		System.out.println(yourClock.getHour());
		System.out.println(myClock);
		myClock.incrementHours();
		myClock.incrementMinutes();
		System.out.println("***********\n"+myClock+"\n***********\n");
		myClock.printTime();
		
	}

}
