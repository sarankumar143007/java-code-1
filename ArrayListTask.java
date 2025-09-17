package Array;
import java.util.*;
public class ArrayListTask {
	//Task-1
			public static void add(ArrayList<Integer> arr) {
				int sum = 0;
				for (int num : arr) {
					sum = sum + num;
				}

				System.out.println("Sum: " + sum);
			}
			public static void main(String[] args) {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				arr.add(1);
				arr.add(2);
				arr.add(3);
				arr.add(4);
				arr.add(5);
				System.out.println("Array List:" + arr);
				add(arr);

	        //Task-2

			System.out.println("Index of The Target Element 3 : " + arr.indexOf(3));
		}
	}
