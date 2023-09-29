package CodingSimplifiedSep2023.Arrays.Problem10;

import java.util.NoSuchElementException;

public class DeleteElement {


    int count = 5;

    public void deleteElementFromEnd(int[] arr) {
        count--;
    }


    public void deleteElement(int[] arr, int target) {

        int i = 0;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                break;
            }
        }

        if (i == arr.length) {
            throw new NoSuchElementException("No such element to delete !");
        }

        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }

        count--;
    }


    public void deleteElementFromPosition(int[] arr, int pos) {

        if (pos < 0 || pos > arr.length - 1) {
            return;
        }


        for (int i = pos - 1; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }


        count--;
    }


    public void printElements(int[] arr) {

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        DeleteElement deleteElement = new DeleteElement();
        deleteElement.deleteElementFromEnd(arr);

        deleteElement.printElements(arr);

        deleteElement.deleteElement(arr, 3);

        System.out.println();

        deleteElement.printElements(arr);

        System.out.println();

        deleteElement.deleteElementFromPosition(arr, 2);

        System.out.println();

        deleteElement.printElements(arr);
    }
}
