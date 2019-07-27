package rerere.video5;


/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class Let19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;


        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        ListNode after = dummyNode;
        for (int i = 0; i <= n; i++) {
            if (after != null) {
                after = after.next;
            } else {
                return null;
            }
        }
        while (after != null) {
            pre = pre.next;
            after = after.next;
        }
        ListNode delNode = pre.next;
        pre.next = delNode.next;
        delNode = null;

        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
       ListNode node = new ListNode(a);
        Let19 l = new Let19();
        System.out.println(l.removeNthFromEnd(node,2));
    }
}
