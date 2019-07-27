package rerere.video6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class Let23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        if (lists.length == 1)
            return lists[0];


        return partiton(lists, 0, lists.length - 1);

    }

    private ListNode partiton(ListNode[] lists, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            ListNode left = partiton(lists, l, m);
            ListNode right = partiton(lists, m + 1, r);
            //合并
            return Merge(left, right);
        }
        return lists[l];

    }

    private ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode node = null;
        if (list1.val >= list2.val) {
            node = list2;
            node.next = Merge(list1, list2.next);
        } else {
            node = list1;
            node.next = Merge(list1.next, list2);
        }

        return node;
    }

    public ListNode mergeKLists1(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for (ListNode temp : lists) {
            while (temp != null) {
                list.add(temp.val);
                temp = temp.next;
            }
        }
        if (list.size() == 0)
            return null;

        Collections.sort(list);

        ListNode root = new ListNode(list.get(0));
        ListNode res = root;
        for (int i = 1; i < list.size(); i++) {
            res.next = new ListNode(list.get(i));
            res = res.next;
        }
        return root;
    }
}
