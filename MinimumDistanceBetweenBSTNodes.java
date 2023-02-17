class MinimumDistanceBetweenBSTNodes {
    public int minDiffInBST(TreeNode root) {
        int[] minDiff = {Integer.MAX_VALUE};
        Integer[] prevVal = {null};
        inorder(root, minDiff, prevVal);
        return minDiff[0];
    }
    
    private void inorder(TreeNode node, int[] minDiff, Integer[] prevValue) {
        if (node == null) {
            return;
        }
        inorder(node.left, minDiff, prevValue);
        if (prevValue[0] != null) {
            minDiff[0] = Math.min(minDiff[0], node.val - prevValue[0]);
        }
        prevValue[0] = node.val;
        inorder(node.right, minDiff, prevValue);
    }}