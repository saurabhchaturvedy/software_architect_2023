package CodingSimplifiedSep2023.Arrays.Problem10;

public class SearchElement {


    public boolean searchElement(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        SearchElement searchElement = new SearchElement();
        boolean b = searchElement.searchElement(arr, 4);

        System.out.println("Is element present ? " + b);
    }
}
