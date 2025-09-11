package Series;

public class FibonacciSeries {
	public static void main(String[] args) {
        int f1 = 0, f2 = 1, f3;
        int n = 5; 

        System.out.print(f1 + " " + f2); 

        for (int i = 1; i <= n - 2; i++) {
            f3 = f1 + f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
    }
}

