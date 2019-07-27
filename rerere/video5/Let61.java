package rerere.video5;


/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 */
public class Let61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        //利用虚拟头节点和滑动窗口解决问题
        ListNode dummyNode = new ListNode(0);

        dummyNode.next = head;
        ListNode p = dummyNode;
        ListNode q = dummyNode;

        //计算链表的长度
        ListNode r = dummyNode;
        int l = 0;
        while (r.next != null) {
            r = r.next;
            l++;
        }
        k = k % l;
        if (k != 0) {
            for (int i = 0; i < k; i++) {
                q = q.next;
            }
            while (q.next != null) {
                p = p.next;
                q = q.next;
            }
            q.next = dummyNode.next;
            dummyNode.next = p.next;
            p.next = null;
        }
        return dummyNode.next;

    }
}
