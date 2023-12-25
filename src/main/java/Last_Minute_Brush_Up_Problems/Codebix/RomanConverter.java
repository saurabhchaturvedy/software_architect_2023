package Last_Minute_Brush_Up_Problems.Codebix;

public class RomanConverter {
    public static String getRomanValue(int N) {
        if (!(N > 0 && N < 1000)) {
            return "Input out of range (0 < N < 1000)";
        }

        // Define the mapping of Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (N >= values[i]) {
                result.append(numerals[i]);
                N -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        int N = 29;
        String result = getRomanValue(N);
        System.out.println(result);
    }
}
