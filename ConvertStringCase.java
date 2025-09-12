package Convert;

public class ConvertStringCase {
	 public static String convertCase(String str) {
	        StringBuilder result = new StringBuilder();
	        for (char c : str.toCharArray()) {
	            if (c >= 'a' && c <= 'z') {
	                
	                result.append((char) (c - 32));
	            } else if (c >= 'A' && c <= 'Z') {
	                
	                result.append((char) (c + 32));
	            } else {
	                
	                result.append(c);
	            }
	        }
	        return result.toString();
	    }
	
	public static void main(String[] args) {
     String str = "COMPuterSCIENCE";
     String result = convertCase(str);
     System.out.println("Original String: " + str);
     System.out.println("Converted String: " + result);
 }

}

