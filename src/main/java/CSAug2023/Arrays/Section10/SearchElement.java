package CSAug2023.Arrays.Section10;

public class SearchElement {


    public int search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        SearchElement searchElement = new SearchElement();
        int[] arr = {12, 7, 39, 14, 99};
        System.out.println("Is element found in array : " + searchElement.search(arr, 14));
    }
}
