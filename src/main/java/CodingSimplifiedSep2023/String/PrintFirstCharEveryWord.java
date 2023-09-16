package CodingSimplifiedSep2023.String;

public class PrintFirstCharEveryWord {


    public static void main(String[] args) {

        String str = "Hello world box";

        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (ch[i] != ' ') {

                if (i == 0) {
                    System.out.print(ch[i] + " ");
                } else if (ch[i - 1] == ' ') {
                    System.out.print(ch[i] + " ");
                }
            }
        }
    }
}
