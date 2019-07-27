package rerere.video5;


/**
 * 示例 1：
 *
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * 示例 2：
 *
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 */
public class Let147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode idx = head;
        ListNode cur = idx.next;
        while (cur != null) {
            ListNode next = cur.next;
            if (idx.val <= cur.val) {
                idx = cur;
                cur = next;
                continue;
            }
            ListNode pre = dummyNode;
            while (pre.next != null && pre != idx && pre.next.val < cur.val) {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            idx.next = next;
            cur = next;

        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Let147 l =new Let147();

        System.out.println(l.insertionSortList(node1));
    }

}
