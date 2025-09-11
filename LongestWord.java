package Word;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longest = "";

        // Loop through each word to find the longest one
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Print the longest word after the loop ends
        System.out.println("Longest word = " + longest);

        sc.close();
    }
}
