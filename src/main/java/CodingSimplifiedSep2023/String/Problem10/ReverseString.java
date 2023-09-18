package CodingSimplifiedSep2023.String.Problem10;

public class ReverseString {


    public String reverseString1(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s;
        }

        return s;
    }


    public String reverse(String str) {

        char[] arr = str.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }


    public static void main(String[] args) {


        ReverseString reverseString = new ReverseString();
        System.out.println(" Reversed string : " + reverseString.reverseString1("hello"));

        System.out.println(" Reversed string 2 : " + reverseString.reverse("diamond"));
    }
}
