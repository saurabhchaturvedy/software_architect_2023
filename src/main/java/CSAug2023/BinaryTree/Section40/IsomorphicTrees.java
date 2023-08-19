package CSAug2023.BinaryTree.Section40;

import CSAug2023.BinaryTree.Section30.TreeNode;

public class IsomorphicTrees {


    public boolean areIsomorphicTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data) {
            return false;
        }


        return (isMirrorStructure(root1.left, root2.right) && isMirrorStructure(root1.right, root2.left)) || (isSameStructure(root1.left, root2.left) && isSameStructure(root1.right, root2.right));
    }

    private boolean isSameStructure(TreeNode first, TreeNode second) {


        if (first == null && second == null) {
            return true;
        }


        if (first == null || second == null) {
            return false;
        }

        return isSameStructure(first.left, second.left) && isSameStructure(first.right, second.right);
    }

    private boolean isMirrorStructure(TreeNode first, TreeNode second) {


        if (first == null && second == null) {
            return true;
        }


        if (first == null || second == null) {

            return false;
        }


        return isMirrorStructure(first.left, second.right) && isMirrorStructure(first.right, second.left);
    }


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(20);
        root1.right = new TreeNode(30);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(20);
        root2.right = new TreeNode(30);

        IsomorphicTrees isomorphicTrees = new IsomorphicTrees();
        boolean isIsomorphicTree = isomorphicTrees.areIsomorphicTrees(root1, root2);

        System.out.println("Is isomorphic tree ?? :::: "+isIsomorphicTree);
    }
}
