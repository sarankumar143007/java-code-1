package Increasingnumbers;

import java.util.Scanner;

public class Increasing_numbers {
  public static void main(String[]args) {
	  int n,i,j, num=1;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter n:");
	  n= sc.nextInt();
	  for(i=1; i<=n; i++) {
		  for(j=1; j<=i; j++) {
			  System.out.print(num+ "");
			  num++;
		  }
		  sc.close();
	  }
  }
}
