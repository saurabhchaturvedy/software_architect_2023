package Good_Solutions_Problems;

class KthSmallest {
    int count =0;
    int out=0;
    public int kthSmallest(TreeNode root, int k) {
        recur(root, k);
        return out;
    }
    
    public void recur(TreeNode node, int k){
        if(node.left != null){
            recur(node.left, k);
        }
        count++;
        if(count == k){
            out = node.data;
            return;
        }
        if(node.right != null){
            recur(node.right, k);
        }
    }
}