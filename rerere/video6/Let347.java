package rerere.video6;

import java.util.*;

public class Let347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        if (k > nums.length)
            return res;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        //按照值的小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );
        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(k) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        while (!pq.isEmpty()) {
            res.add(pq.remove());
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {4,1,-1,2,-1,2,3};

        int k = 2;
        System.out.println(new Let347().topKFrequent(a, 2));
    }
}
