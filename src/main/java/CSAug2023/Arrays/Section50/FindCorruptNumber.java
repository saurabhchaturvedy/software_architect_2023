package CSAug2023.Arrays.Section50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCorruptNumber {


    public List<Integer> findCorruptNumbers(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {

                int otherIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[j + 1]) {
                return new ArrayList<>(Arrays.asList(i + 1, arr[j]));
            }
        }

        return new ArrayList<>();
    }


    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 5, 1};
        FindCorruptNumber findCorruptNumber = new FindCorruptNumber();
        System.out.println(findCorruptNumber.findCorruptNumbers(arr));
    }
}
