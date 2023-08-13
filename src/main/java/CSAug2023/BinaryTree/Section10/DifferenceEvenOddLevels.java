package CSAug2023.BinaryTree.Section10;

public class DifferenceEvenOddLevels {


    public int differenceEvenOddLevels(TreeNode root) {
        if (root == null) {
            return 0;
        }


        return root.data - differenceEvenOddLevels(root.left) - differenceEvenOddLevels(root.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(30);
        root.left = new TreeNode(15);
        root.right = new TreeNode(20);

        DifferenceEvenOddLevels differenceEvenOddLevels = new DifferenceEvenOddLevels();
        int sum = differenceEvenOddLevels.differenceEvenOddLevels(root);
        System.out.println("Difference in levels = " + sum);
    }
}
