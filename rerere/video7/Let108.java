package rerere.video7;


/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * <p>
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
public class Let108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return getBST(nums, 0, nums.length);
    }

    private TreeNode getBST(int[] nums, int l, int r) {
        if (l >= r)
            return null;
        int mid = l + (r - l) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = getBST(nums, l, mid);
        node.right = getBST(nums, mid + 1, r);
        return node;

    }


}
