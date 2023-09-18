package CodingSimplifiedSep2023.String.Problem10;

public class TrimString {


    public static void main(String[] args) {


        String str = "   Hello     word!!!    ";


        System.out.println(" String length : " + str.length());

        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;


        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != ' ') {
                start = i;
                break;
            }
        }

        for (int i = arr.length - 1; i > start - 1; i--) {

            if (arr[i] != ' ') {
                end = i;
                break;
            }
        }

        int count = end - start + 1;

        String trimmedStr = new String(arr, start, count);


        System.out.println(" String length : " + trimmedStr.length());

        System.out.println(" Trimmed string is : " + trimmedStr);


    }


}
