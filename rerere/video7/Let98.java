package rerere.video7;

public class Let98 {
    long last = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        boolean ans = true;
        if (root == null)
            return true;
        ans = ans && isValidBST(root.left);
        if (last < root.val)
            last = root.val;
        else
            return false;

        ans = ans && isValidBST(root.right);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p5 = new TreeNode(5);
        root.left = p2;
        root.right=p3;
        p2.left=p5;
        Let98 l =new Let98();
        System.out.println(l.isValidBST(root));
    }
}
