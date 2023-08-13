package CSAug2023.BinaryTree.Section30;

import CSAug2023.BinaryTree.TreeNode;

public class GetLevelOfNode {


    public int getLevelOfNode(TreeNode root, int targetValue, int currentLevel) {

        if (root == null) {
            return -1;
        }

        if (root.data == targetValue) {
            return currentLevel;
        }

        int leftLevel = getLevelOfNode(root.left, targetValue, currentLevel + 1);

        if (leftLevel != -1) {
            return leftLevel;
        }

        int rightLevel = getLevelOfNode(root.right, targetValue, currentLevel + 1);

        return rightLevel;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(78);
        root.right = new TreeNode(88);

        GetLevelOfNode getLevelOfNode = new GetLevelOfNode();
        int levelOfNode = getLevelOfNode.getLevelOfNode(root, 78, 1);

        System.out.print("Level of the node is : " + levelOfNode);
    }
}
