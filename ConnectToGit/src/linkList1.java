import java.util.*;
public class linkList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors = {"black", "yellow", "green", "blue","violet","silver"};
		List<String>list1=new LinkedList<>();
		
		for(String color:colors)
			list1.add(color);
		
		String[] colors2= {"gold","white","brown","blue","gray","silver"};
		List<String>list2=new LinkedList<>();
		
		for(String color:colors2)
			list2.add(color);
		
		list1.addAll(list2);
		list2=null;
		printList(list1);
		System.out.println(" ");
		printReverseList(list1);
	}
	
	private static void printList(List<String> list) {
		System.out.println("Here is your color list:");
		for (String color:list)
			System.out.println(color);
	}
	private static void printReverseList(List<String> list) {
		System.out.println("Here is your color list *REVERSED*:");
		ListIterator<String> iterator=list.listIterator(list.size()); //attaches iterator to max number in color list
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
