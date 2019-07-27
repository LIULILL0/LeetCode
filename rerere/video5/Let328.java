package rerere.video5;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * 示例 2:
 *
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 */
public class Let328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyNode1 = new ListNode(-1);

        ListNode dummyNode2 = new ListNode(-1);

        ListNode d1 = dummyNode1;
        ListNode d2 = dummyNode2;
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            if (count % 2 == 0) {
                d1.next = cur;
                d1 = d1.next;
                cur = cur.next;
                d1.next=null;
                count++;
            } else {
                d2.next = cur;
                d2 = d2.next;
                cur = cur.next;
                d2.next=null;
                count++;
            }

        }
        d1.next = dummyNode2.next;
        return dummyNode1.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Let328 l =new Let328();
        System.out.println(l.oddEvenList(node1));

    }
}
