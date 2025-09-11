package continuous_alphabet;

import java.util.Scanner;

public class Continuous_Alphabet {
    public static void main(String[] args) {
        int n;
        char c = 'A';  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) { 
        	
            for (int j = 1; j <= i; j++) {
                System.out.print(c++);
            }
            System.out.println(); 
        }

        sc.close();
    }
}
