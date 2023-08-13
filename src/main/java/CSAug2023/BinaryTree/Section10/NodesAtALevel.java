package CSAug2023.BinaryTree.Section10;

public class NodesAtALevel {


    public void printNodesAtALevel(TreeNode root, int targetLevel) {

        if (root == null) {
            return;
        }

        if (targetLevel == 1) {
            System.out.print(root.data + " ");
        }
        printNodesAtALevel(root.left, targetLevel - 1);
        printNodesAtALevel(root.right, targetLevel - 1);
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(22);
        root.left.left = new TreeNode(66);
        root.left.left.left = new TreeNode(88);

        root.left.left.right = new TreeNode(77);

        root.right = new TreeNode(33);
        root.right.right = new TreeNode(44);

        NodesAtALevel nodesAtALevel = new NodesAtALevel();
        nodesAtALevel.printNodesAtALevel(root, 4);
    }
}
