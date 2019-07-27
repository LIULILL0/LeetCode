package rerere.video5;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Let21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode root = null;
        if (l1.val > l2.val) {
            root = l2;
            root.next = mergeTwoLists(l1, l2.next);
        } else {
            root = l1;
            root.next = mergeTwoLists(l1.next, l2);
        }
        return root;
    }
}
