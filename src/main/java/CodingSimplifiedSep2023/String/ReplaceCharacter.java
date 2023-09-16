package CodingSimplifiedSep2023.String;

public class ReplaceCharacter {


    public static void main(String[] args) {

        String str = "Java programming geeks";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = 'b';
            }
        }

        System.out.println("Repalced char string = " + new String(arr));
    }
}
