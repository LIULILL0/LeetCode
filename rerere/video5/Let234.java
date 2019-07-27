package rerere.video5;

/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 */
public class Let234 {
    //第一步是用快慢指针
    //第二步反转后半部分的链表
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        slow.next = null;
        ListNode pre = null;

        while(cur!=null){
            ListNode nx = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nx;
        }
        ListNode newHead = head;
        while(pre!=null && newHead!=null){
            if(pre.val!=newHead.val){
                return false;
            }
            pre = pre.next;
            newHead = newHead.next;
        }

        return true;
    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
       Let234 l =new Let234();
        System.out.println(l.isPalindrome(node1));
    }

}
