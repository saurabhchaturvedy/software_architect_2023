package CSAug2023.BinaryTree.Section30;

public class PrintBoundaryNodes {


    public void printBoundaryNodes(TreeNode root) {

        if (root != null) {
            System.out.print(root.data + " ");
            printLeftBoundary(root.left);
            printLeaves(root.left);
            printLeaves(root.right);
            printRightBoundary(root.right);
        }
    }

    private void printRightBoundary(TreeNode node) {

        if (node == null) {
            return;
        }

        if (node.right != null) {
            System.out.print(node.data + " ");
            printRightBoundary(node.right);
        } else if (node.left != null) {
            System.out.print(node.data + " ");
            printRightBoundary(node.left);
        }
    }

    private void printLeaves(TreeNode node) {

        if (node == null) {
            return;
        }

        printLeaves(node.left);

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        printLeaves(node.right);
    }

    private void printLeftBoundary(TreeNode node) {

        if (node == null) {
            return;
        }

        if (node.left != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printLeftBoundary(node.right);
        }
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(50);
        TreeNode right = new TreeNode(60);

        PrintBoundaryNodes printBoundaryNodes = new PrintBoundaryNodes();
        printBoundaryNodes.printBoundaryNodes(root);

    }
}
