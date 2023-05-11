package Last_Minute_Brush_Up_Problems;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {


    public boolean isBST(TreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();

        inorder(root, inOrderList);

        boolean isBST = true;
        int prev = inOrderList.get(0);

        for (int i = 1; i < inOrderList.size(); i++) {
            if (inOrderList.get(i) <= prev) {
                return false;
            }

            prev = inOrderList.get(i);
        }

        return isBST;
    }

    private void inorder(TreeNode root, List<Integer> inOrderList) {

        if (root == null) {
            return;
        }

        inorder(root.left, inOrderList);
        inOrderList.add(root.data);
        inorder(root.right, inOrderList);
    }


    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {

        TreeNode one = new TreeNode(5);
        TreeNode two = new TreeNode(8);
        TreeNode three = new TreeNode(3);

        one.left = two;
        one.right = three;

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        System.out.println(" is a valid BST ? " + validateBinarySearchTree.isBST(one));
        validateBinarySearchTree.inorder(one);

        TreeNode four = new TreeNode(11);
        TreeNode five = new TreeNode(8);
        TreeNode six = new TreeNode(19);

        four.left = five;
        four.right = six;

        System.out.println(" is a valid BST ? " + validateBinarySearchTree.isBST(four));
    }
}
