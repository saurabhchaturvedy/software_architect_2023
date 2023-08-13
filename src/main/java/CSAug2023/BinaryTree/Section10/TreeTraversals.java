package CSAug2023.BinaryTree.Section10;

public class TreeTraversals {


    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }


        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }


        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(34);
        root.left = new TreeNode(57);
        root.right = new TreeNode(63);

        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.preorder(root);
        System.out.println();
        treeTraversals.inorder(root);

        System.out.println();
        treeTraversals.postorder(root);
    }
}
