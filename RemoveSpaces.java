package spaces;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] chr_arr = str.toCharArray();
        String res = "";

        for (char c : chr_arr) {
            if (c != ' ') { 
                res = res + c;
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("Without space: " + res);
    }
}
