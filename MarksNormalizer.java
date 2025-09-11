package marks;

public class MarksNormalizer {
  public static void main(String[]args) {
	  int[] marks= {95,76,88,100};
	  for (int i=0;i<marks.length;i++) {
		  System.out.print(marks[i]+"\t");
		  marks[i]=Math.min(100,marks[i]+5);
	  }
	  System.out.println("After adding 5 \n");
	  for (int i : marks) {
		  System.out.println(i+"\t");
	  }
  }
}
