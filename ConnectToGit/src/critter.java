
public class critter {
	//instance variables
	private String critName;
	private String critMood;
	public String critInfo;
	
	//constructor methods
	public critter() {
		setName("Steve");
		setMood("Tired");
	}
	public void setName(String uName) {
		critName=uName;
	}
	public void setMood(String uMood) {
		critMood=uMood;
	}
	//getter--accessor methods
	public String getName() {
		return critName;
	}
	public String getMood() {
		return critMood;
	}
	//to string: override
	public String toString() {
		String critInfo = "** Your New Critter **";
		critInfo+="\nYour Critter's Name: "+critName;
		critInfo+="\nYour Critter's Mood: "+critMood;
		return critInfo;
	}
	//regular method
	public void pInfo() {
		System.out.print(critInfo);
	}

}
