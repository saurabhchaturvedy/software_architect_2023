package Last_Minute_Brush_Up_Problems.Codebix;

public class StringMatcher {
    public static int indexOf(String s, String x) {
        int sLength = s.length();
        int xLength = x.length();
        
        for (int i = 0; i <= sLength - xLength; i++) {
            boolean match = true;
            
            for (int j = 0; j < xLength; j++) {
                char sChar = s.charAt(i + j);
                char xChar = x.charAt(j);
                
                if (xChar != '*' && sChar != xChar) {
                    match = false;
                    break;
                }
            }
            
            if (match) {
                return i;
            }
        }
        
        return -1; // Not found
    }

    public static void main(String[] args) {
        String s = "xabcdey";
        String x = "ab*de";

        int index = indexOf(s, x);

        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found in the string.");
        }
    }
}
