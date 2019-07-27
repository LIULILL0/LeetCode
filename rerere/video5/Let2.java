package rerere.video5;


/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Let2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if(l2==null)
            return l1;
        int v = l1.val + l2.val;
        if (v > 9) {
            l1.val = v - 10;
            l1.next = addOne(l1.next);
        } else {
            l1.val = v;
        }
        l1.next = addTwoNumbers(l1.next, l2.next);
        return l1;

    }

    private ListNode addOne(ListNode node) {
        if (node == null)
            return new ListNode(1);

        if (node.val == 9) {
            node.val = 0;
            node.next = addOne(node.next);
        } else {
            ++node.val;
        }
        return node;

    }

    public static void main(String[] args) {
        ListNode node1_2 = new ListNode(2);
        ListNode node1_4 = new ListNode(4);
        ListNode node1_3 = new ListNode(9);
        node1_2.next = node1_4;
        node1_4.next = node1_3;

        ListNode node2_5 = new ListNode(5);
        ListNode node2_6 = new ListNode(6);
        ListNode node2_4 = new ListNode(4);
        node2_5.next = node2_6;
        node2_6.next = node2_4;
        Let2 l = new Let2();
        System.out.println(l.addTwoNumbers(node1_2, node2_5));


    }
}
