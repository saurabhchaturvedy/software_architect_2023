package CodingSimplifiedSep2023.String.Problem20;

public class StringWithBackspaceCharacters {


    public boolean areStringsEqualWithBackspaceCharacters(String str1, String str2) {

        int end1 = str1.length() - 1;
        int end2 = str2.length() - 1;


        while (end1 >= 0 && end2 >= 0) {
            int str1Index = getCharIndex(str1, end1);
            int str2Index = getCharIndex(str2, end2);
            if (str1Index < 0 && str2Index < 0) {
                return true;
            }

            if (str1Index < 0 || str2Index < 0) {
                return false;
            }

            if (str1.charAt(str1Index) != str1.charAt(str2Index)) {
                return false;
            }


            end1 = str1Index- 1;
            end2 = str2Index - 1;
        }

        if (end1 == -1 && end2 == -1) {
            return true;
        } else {

            return false;
        }

    }


    public int getCharIndex(String str, int end) {

        int specialChar = 0;

        while (end >= 0) {

            if (str.charAt(end) != '#') {
                if (specialChar == 0) {
                    return end;
                } else {
                    specialChar--;
                }
            } else {
                specialChar++;
            }

            end--;
        }


        return end;
    }

    public static void main(String[] args) {

        String str1 = "bcd##e";
        String str2 = "bd#e";

        StringWithBackspaceCharacters stringWithBackspaceCharacters = new StringWithBackspaceCharacters();
        System.out.println("String with backspaces are equal ? : " + stringWithBackspaceCharacters.areStringsEqualWithBackspaceCharacters(str1, str2));
    }
}
