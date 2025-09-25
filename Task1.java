package value;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int arr[] =  new int[n];
	for(int i = 0; i<n; i++) {
		arr[i] = sc.nextInt();
	}
	 System.out.println("Sum : " + kSmallestSum(arr, k));
	 sc.close();
	 }
	 public static int kSmallestSum(int[] arr, int k) {
	        Arrays.sort(arr);  // sort array ascending
	        int sum = 0;
	        for (int i = 0; i < k && i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
	    }
	}
