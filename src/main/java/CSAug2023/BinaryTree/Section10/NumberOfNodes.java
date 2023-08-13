package CSAug2023.BinaryTree.Section10;

import CSAug2023.BinaryTree.TreeNode;

public class NumberOfNodes {


    public int numberOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }


        return 1 + numberOfNodes(root.left) + numberOfNodes(root.right);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        NumberOfNodes numberOfNodes = new NumberOfNodes();
        int numberedOfNodes = numberOfNodes.numberOfNodes(root);

        System.out.println("Number of nodes = " + numberedOfNodes);
    }
}
