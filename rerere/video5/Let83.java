package rerere.video5;


/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Let83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode phead = head;
        while (phead != null) {
            ListNode temp = phead.next;
            if (temp != null && phead.val == temp.val) {
                while (temp != null && phead.val == temp.val) {
                    temp = temp.next;
                }
                phead.next = temp;
            } else {
                phead = temp;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode cur = head;

        while (cur != null) {
            if (cur.next != null && cur.next.val == cur.val) {
                while (cur.next != null && cur.next.val == cur.val) {
                    cur = cur.next;
                }
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummyNode.next;
    }

}
