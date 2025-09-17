package Problems;

import java.util.ArrayList; 
///Creating ArrayList 
public class CollectionProblems {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist .add(35);
		arrlist .add(15);
		arrlist .add(90);
		arrlist .add(27);
		arrlist .add(76);
		arrlist .add(65);
		arrlist .add(37);
		arrlist .add(12);
		System.out.println("Add Elements:" + arrlist );
		System.out.println("Access Element:" + arrlist .get(2));
		System.out.println("Modify Elemet:" + arrlist .set(1, 40));
		System.out.println("After Modify List:" + arrlist );
		System.out.println("Remove Elment:" + arrlist .remove(4));
		System.out.println("After Remove Element List:" + arrlist );
		System.out.println("Check Size:" + arrlist .size());
		System.out.println("Search Element:" +arrlist .contains(10));
		for (int num : arrlist ) {
			System.out.println(num + " ");
		} 
		arrlist .clear();
		System.out.println("The List is Empty:" + arrlist .isEmpty());
	}
}