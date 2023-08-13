package CSAug2023.BinaryTree.Section30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderTraversal {


    public void verticalOrderTraversal(TreeNode root, int hd, Map<Integer, List<Integer>> map) {

        if (root == null) {
            return;
        }

        List<Integer> nodes = map.get(hd);
        if (nodes == null) {
            nodes = new ArrayList<>();
            nodes.add(root.data);
        } else {
            nodes.add(root.data);
        }
        map.put(hd,nodes);
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

        VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        verticalOrderTraversal.verticalOrderTraversal(root, 0, map);

        System.out.println("TOP VIEW : ");

        for (List<Integer> list : map.values()) {
            System.out.print(list.get(0) + " ");
        }

        System.out.println();
        System.out.println("BOTTOM VIEW : ");

        for (List<Integer> list : map.values()) {
            System.out.print(list.get(list.size() - 1) + " ");
        }
    }
}
