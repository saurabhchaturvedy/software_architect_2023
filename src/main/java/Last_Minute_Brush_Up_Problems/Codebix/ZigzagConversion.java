package Last_Minute_Brush_Up_Problems.Codebix;

import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion {


    public String zigZag(String str, int numOfRows) {
        Map<Integer, String> map = new HashMap<>();
        int row = 1;
        int index = 0;
        boolean increase = true;


        while (index < str.length()) {

            String currValue = map.getOrDefault(row, "");
            map.put(row, currValue + str.charAt(index++));

            if (increase) {
                row++;
                if (row == numOfRows) increase = !increase;
            } else if (!increase) {
                row--;
                if (row == 1) increase = !increase;
            }

        }

        String ans = "";

        for (Integer x : map.keySet()) {
            ans = ans + map.get(x);
        }


        return ans;
    }


    public static void main(String[] args) {

        String str = "PAYPALISHIRING";
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        System.out.println("Zigzagged string is = "+zigzagConversion.zigZag(str,4));
    }
}
