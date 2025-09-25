package Min;
import java.util.*;
public class MinHeap {
	public static void main(String[] args) {
		PriorityQueue<Integer>minHeap = new PriorityQueue<>();
		minHeap.add(20);
		minHeap.add(15);
		minHeap.add(30);
		minHeap.add(10);
		minHeap.add(23);
		
		System.out.println("Min Heap: "+ minHeap);
		System.out.println("Peek (min): "+ minHeap.peek());
		System.out.println("Poll (remove min): "+ minHeap.poll());
		System.out.println("After Poll: "+ minHeap);

	}
	
}

