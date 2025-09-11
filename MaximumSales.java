package sales;

public class MaximumSales {
    public static void main(String[] args) {
        int[] sales = {120, 340, 560, 230, 999};
        int max_sale = Integer.MIN_VALUE;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max_sale) {
                max_sale = sales[i]; 
            }
        }

        System.out.println("Max sale = " + max_sale);
    }
}
