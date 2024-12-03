import java.util.Scanner;

public class recursionMethod {

	public static void main(String[] args) {
		System.out.println("Enter list of words, one per line");
		System.out.println("Final work should be a period.");
		stackwords();
		System.out.println(stackwords2());
		System.out.println("--the end--");

	}
	
	public static void drawline(int n) {
		if(n==0) {
			System.out.println("----------------");
		} else for(int i=1; i<=n; i++) {
			System.out.print("*");
		System.out.println();
		drawline(n-1);
		}
	}
	
	public static String stackwords2() {
		Scanner IO=new Scanner(System.in);
		String word=IO.nextLine();
		if(word.equals(".")) {
			return (word);
		} else {
			return stackwords2();
		}
	}
	
	public static void stackwords() {
		Scanner IO=new Scanner(System.in);
		String word=IO.nextLine();
		if (word.equals(".")) {
			System.out.println("aaaaa");
		} else {
			stackwords();
		}
		System.out.println(word);
	}

}
