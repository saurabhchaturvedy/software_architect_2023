package CSAug2023.BinaryTree.Section10;

public class SumOfAllNodes {


    public int sumOfAllNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return root.data + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(73);
        root.left = new TreeNode(20);
        root.right = new TreeNode(45);

        SumOfAllNodes sumOfAllNodes = new SumOfAllNodes();
        int sum = sumOfAllNodes.sumOfAllNodes(root);
        System.out.print("sum of all nodes " + sum);
    }
}
