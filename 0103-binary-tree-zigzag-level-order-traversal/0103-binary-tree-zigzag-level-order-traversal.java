/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        boolean isAsc = true;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> sublist = new ArrayList<>();
            while(size-- != 0){
                TreeNode node = q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                if(isAsc) sublist.add(node.val);
                else sublist.add(0, node.val);
            }
            isAsc = !isAsc;
            ans.add(sublist);
            
        }
        return ans;
    }
}