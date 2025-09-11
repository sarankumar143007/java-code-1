package EvenNumbers;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                evencount++;
            else
                oddcount++;
        }

        System.out.println("Even number count = " + evencount);
        System.out.println("Odd number count = " + oddcount);
    }
}
