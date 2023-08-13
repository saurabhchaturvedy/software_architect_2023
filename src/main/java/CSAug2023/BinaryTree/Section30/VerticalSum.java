package CSAug2023.BinaryTree.Section30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {


    public void verticalOrderTraversal(TreeNode root, int hd, Map<Integer, Integer> map) {

        if (root == null) {
            return;
        }

        map.put(hd, map.getOrDefault(hd, 0) + root.data);
        verticalOrderTraversal(root.left, hd - 1, map);
        verticalOrderTraversal(root.right, hd + 1, map);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(7);

        VerticalSum verticalSum = new VerticalSum();
        Map<Integer, Integer> map = new TreeMap<>();
        verticalSum.verticalOrderTraversal(root, 0, map);

        System.out.print(map.values()+" ");
    }
}
