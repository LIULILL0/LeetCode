package rerere.video5;


/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class Let206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        if (head == null)
            return null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;

            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;

    }
}
