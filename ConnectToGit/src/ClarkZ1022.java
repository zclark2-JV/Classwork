import java.util.Scanner;

public class ClarkZ1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bookingAmnt;
		String[] seatList = new String[10];
		for (int i=0; i<seatList.length;i++) {
			seatList[i]= " ";
		}
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Welcome to the booking application!\nThere are 10 seats on this plane\nHow many people are trying to book for? ");
		bookingAmnt = reader.nextInt();
		
		String[] bookingList = new String[bookingAmnt];
		
		for(int i=0;i<bookingList.length;i++) {
			System.out.println("Please enter the name of Booking #"+(i+1)+": ");
			bookingList[i]=reader.next();
		}
		boolean runAgain=false;
		if (runAgain==false);
			for(int i=0;i<bookingAmnt;i++) {
				System.out.println("What seat would you like "+bookingList[i]+" to sit in? ");
				boolean seatConfirmation=false;
				int selected = reader.nextInt();
				if (seatList[selected].equals("R")) {
					System.out.println("Unfortunately that seat is booked. Please try again!");
					i-=1;
					runAgain=true;
				}
				if (!seatList[selected].equals("R")) {
					System.out.println("You have successfully booked "+bookingList[i]+" Seat #"+selected);
					seatConfirmation=true;
					seatList[selected] = "R";
				}
		
			}
	}

}
