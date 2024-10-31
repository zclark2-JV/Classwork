import java.util.*;

public class arrayList1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<4;i++) {
			list.add(i*i);
		}
		for (int i=0;i<4;i++) {
			System.out.println(list.get(i));
		}
		int num=list.get(2);
		list.add(1,7);
		System.out.println("*****");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for (Integer num2: list)
			System.out.println(num2);
	}
}
