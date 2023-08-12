package CSAug2023.Arrays.Section50;

public class CycleInCircularArray {


    public boolean hasCycle(int[] arr) {

        int slow = 0;
        int fast = 0;

        boolean isForward = arr[0] >= 0;

        while (true) {

            slow = getNextIndex(arr, slow, isForward);
            if (slow == -1) {
                break;
            }

            fast = getNextIndex(arr, fast, isForward);
            if (fast == -1) {
                break;
            }


            fast = getNextIndex(arr, fast, isForward);
            if (fast == -1) {
                break;
            }

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    private int getNextIndex(int[] arr, int index, boolean isForward) {

        if (isForward != arr[index] >= 0) {
            return -1;
        }

        int nextIndex = (index + arr[index]) % arr.length;

        if (nextIndex == index) {
            return -1;
        }

        if (nextIndex < 0) {
            nextIndex = nextIndex + arr.length;
        }

        return nextIndex;
    }


    public static void main(String[] args) {
        int[] circularArray = {2, -1, 1, 2, 2};
        CycleInCircularArray cycleInCircularArray = new CycleInCircularArray();
        boolean hasCycle = cycleInCircularArray.hasCycle(circularArray);
        System.out.println("Circular array has cycle ? ::: " + hasCycle);
    }
}
