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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        int s = 0, e = ans.size() - 1;
        while(s < e){
            int sum = ans.get(s) + ans.get(e);
            if(sum == k) return true;
            else if( sum > k ) e--;
            else s++;
        }
        return false;
    }
    public void inorder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}