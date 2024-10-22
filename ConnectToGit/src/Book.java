
public class Book {

	private String title;
	private String author;
	private double price;
	private int quantity;

	public Book(String title, String author, double price, int quantity) {
		this.title =title;
		this.author =author;
		this.price =price;
		this.quantity =quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String toString() {
		return "Title: "+title+"\n"+"Author: "+author+"\n"+"Price: $"+price+"\n"+"Quantity: "+quantity;
	}

}
