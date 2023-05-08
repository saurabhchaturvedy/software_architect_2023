package Last_Minute_Brush_Up_Problems;

public class RunLengthEncoding {


    public void encode(String str) {
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
    }


    public static void main(String[] args) {

        String str = "cccccbbbrrrrrffffftteee";
        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
        runLengthEncoding.encode(str);

    }
}
