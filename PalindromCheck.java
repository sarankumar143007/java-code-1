package Check;

public class PalindromCheck {
    public static void main(String[] args) {
        String S = "level";
        boolean isPalindrome = true;

        int len = S.length();

        for (int i = 0; i < len / 2; i++) {
            if (S.charAt(i) != S.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(S + " is a palindrome.");
        } else {
            System.out.println(S + " is not a palindrome.");
        }
    }
}
