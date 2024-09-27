
public class critter {
	//instance variables
	private String critName;
	private String critMood;
	public String critInfo;
	
	//constructor methods
	public critter(String critName, String critMood) {
		setName("Steve");
		setMood("Tired");
	}
	public void setName(String uName) {
		critName=uName;
	}
	public void setMood(String uMood) {
		critMood=uMood;
	}
	//to string: override
	public String toString() {
		String critInfo = "** Your New Critter **\n";
		critInfo+=critName+"Your Critter's Name: ";
		critInfo+=critMood+"Your Critter's Mood: ";
		return critInfo;
	}
	//regular method
	public void pInfo() {
		System.out.print(critInfo+"hey");
	}

}
