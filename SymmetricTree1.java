class SymmetricTree1 {
    private boolean check(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null){
            return root1==root2;
        }
        return root1.val==root2.val && check(root1.left,root2.right) && check(root1.right,root2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}