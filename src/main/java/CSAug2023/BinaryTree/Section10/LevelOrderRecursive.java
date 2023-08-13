package CSAug2023.BinaryTree.Section10;

public class LevelOrderRecursive {


    public int height(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }


    public void printNodesAtALevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }

        printNodesAtALevel(root.left, level - 1);
        printNodesAtALevel(root.right, level - 1);

    }


    public void levelOrderRecursive(TreeNode root) {


        int height = height(root);

        for (int i = 0; i <= height; i++) {
            printNodesAtALevel(root, i + 1);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(60);
        root.right = new TreeNode(80);

        LevelOrderRecursive levelOrderRecursive = new LevelOrderRecursive();
        levelOrderRecursive.levelOrderRecursive(root);
    }
}
