import java.util.*;

public class arrayList2 {
	static String lineBreak = "************";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors= {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> colorlist=new ArrayList<String>();
		
		for (String color: colors) {
			colorlist.add(color);
		}
		String[] removeColors= {"RED", "WHITE", "BLUE"};
		List<String> removelist=new ArrayList<String>();
		
		for (String color: removeColors) {
			removelist.add(color);
		}
		System.out.println("colorList:");
		for (int count=0; count<colorlist.size(); count++) {
			System.out.println(colorlist.get(count));
		}
		System.out.println(lineBreak);
		removeColors(colorlist, removelist);
		System.out.println(lineBreak);
		System.out.println("ColorList after removing: ");
		for (String color: colorlist) {
			System.out.println(color);
		}
	}
	private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
		Iterator<String> iterator=collection1.iterator();
		while(iterator.hasNext()) {
			if(collection2.contains(iterator.next())) {
				System.out.println("[!] Removing - "+iterator.next());
				iterator.remove();
			}
		}
	}

}
