package Last_Minute_Brush_Up_Problems;

public class JumpGame {


    public boolean canReach(int[] arr) {
        int lastKnownPos = arr.length - 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (i + arr[i] >= lastKnownPos) {
                lastKnownPos = i;
            }
        }

        return lastKnownPos == 0;
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 1, 4};
        JumpGame jumpGame = new JumpGame();
        System.out.println(" can reach or not ?? " + jumpGame.canReach(arr));
    }
}
