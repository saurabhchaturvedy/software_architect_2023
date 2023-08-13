package CSAug2023.BinaryTree.Section30;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSearch {


    public boolean recursiveSearch(TreeNode node, int key) {
        if(node == null) {
            return false;
        }

        if(node.data == key) {
            return true;
        }

        return recursiveSearch(node.left, key) || recursiveSearch(node.right, key);
    }

    public boolean iterativeSearch(TreeNode node, int key) {
        if (node == null) {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(node);

        while (!q.isEmpty()) {
            TreeNode t = q.remove();
            if (t.data == key) {
                return true;
            }

            if (t.left != null) {
                q.add(t.left);
            }

            if (t.right != null) {
                q.add(t.right);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(7);

        BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch();
        System.out.println(binaryTreeSearch.iterativeSearch(root,6));
        System.out.println(binaryTreeSearch.recursiveSearch(root,89));
    }
}
