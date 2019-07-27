package rerere.video5;


/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * <p>
 * 你应当保留两个分区中每个节点的初始相对位置。
 * <p>
 * 示例:
 * <p>
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 */
public class Let86 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyNode = new ListNode(-1);
        ListNode dummyNode1 = new ListNode(-1);

        ListNode less3 = dummyNode;
        ListNode more3 = dummyNode1;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val < x) {
                less3.next = cur;
                less3 = less3.next;
                cur = cur.next;
                less3.next = null;
            } else {
                more3.next = cur;
                more3 = more3.next;
                cur = cur.next;
                more3.next = null;
            }
        }
        less3.next = dummyNode1.next;
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Let86 l =new Let86();
        System.out.println(l.partition(node1,3));
    }
}
