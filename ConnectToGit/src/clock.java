
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
	public void setTime(int hours, int minutes, int seconds) {
		hr=hours;
		min=minutes;
		sec=seconds;
	}
	
}
