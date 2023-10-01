package CodingSimplifiedSep2023.Arrays.CircularArray;

public class CircularArrayCycle {


    public boolean hasCycle(int[] arr) {


        if (arr.length <= 0) {
            return false;
        }

        int slow = 0;
        int fast = 0;
        boolean isForward = false;

        for (int i = 0; i < arr.length; i++) {

            slow = fast = i;
            isForward = arr[i] >= 0;
            while (true) {

                slow = getNextPosition(arr, slow, isForward);
                if (slow == -1) {
                    break;
                }

                fast = getNextPosition(arr, fast, isForward);

                if (fast == -1) {
                    break;
                }

                fast = getNextPosition(arr, fast, isForward);

                if (fast == -1) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }

            }
        }

        return false;
    }

    private int getNextPosition(int[] arr, int index, boolean isForward) {

        boolean direction = arr[index] >= 0;

        if (direction != isForward) {
            return -1;
        }

        int nextIndex = (index + arr[index]) % arr.length;

        if (nextIndex < 0) {
            nextIndex = nextIndex + arr.length;
        }

        if (nextIndex == index) {
            return -1;
        }
        return nextIndex;
    }


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 1, 2};

        CircularArrayCycle circularArrayCycle = new CircularArrayCycle();

        System.out.println("Circular array has a cycle ?? " + circularArrayCycle.hasCycle(arr));
    }
}
