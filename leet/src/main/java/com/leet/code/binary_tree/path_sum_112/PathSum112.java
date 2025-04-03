package com.leet.code.binary_tree.path_sum_112;

class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        return check(0, targetSum, root);
    }


    private boolean check(int aggregatedSum, int targetSum, TreeNode root) {
        if(root.left== null && root.right == null) {
            return aggregatedSum + root.val == targetSum;
        } else if(root.left != null && root.right == null) {
            return check(aggregatedSum + root.val, targetSum, root.left);
        } else  if(root.left == null){
            return check(aggregatedSum + root.val, targetSum, root.right);
        }
        return check(aggregatedSum + root.val, targetSum, root.right)
                ||
                check(aggregatedSum + root.val, targetSum, root.left);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
