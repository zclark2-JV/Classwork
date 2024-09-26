
public class clock {
	//instance variables
	private int hr;
	private int min;
	private int sec;
	
	//constructor method | must be called same as class
	public clock() {
		setTime(0, 0, 0);
	}
	public clock(int hours, int minutes, int seconds) {
		setTime(hours, minutes, seconds);
	}
	//regular method
	public void setTime(int hours, int minutes, int seconds) {
		if (hours>=0 && hours<24)
			hr=hours;
		else
			hr=0;
		if (hours>=0 && hours<60)
			min=minutes;
		else
			min=0;
		if (hours>=0 && hours<60)
			sec=seconds;
		else
			sec=0;
	}
	//setter--mutator methods
	public void setHour(int hours) {
		hr=hours;
	}
	//getter--accessor methods
	public int getHour() {
		return hr;
	}
	public void printTime() {
		if(hr<10)
			System.out.print(0);
		System.out.print(hr);
		System.out.print(":");
		if(min<10)
			System.out.print(0);
		System.out.print(min);
		System.out.print(":");
		if(sec<10)
			System.out.print(0);
		System.out.print(sec);
	}
	//to string: override
	public String toString() {
		String pClock="Hour: ";
		if(hr<10)
			pClock+="0";
		pClock+=hr+"\nMinute: ";
		if(min<10)
			pClock+="0";
		pClock+=min+"\nSecond: ";
		if(sec<10)
			pClock+="0";
		pClock+=sec;
		return pClock;
	}
	public void incrementHours() {
		hr++;
		if(hr>23)
			hr=0;
	}
	public void incrementMinutes() {
		min++;
		if(min>59)
			min=0;
	}
	
}
