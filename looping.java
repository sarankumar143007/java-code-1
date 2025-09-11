package Looping_statements;
import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        n = sc.nextInt();

        boolean isPrime = true;

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " is prime");
        }

        sc.close();
    }
}
