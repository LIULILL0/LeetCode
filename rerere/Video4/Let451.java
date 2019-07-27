package rerere.Video4;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "tree"
 * <p>
 * 输出:
 * "eert"
 * <p>
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 */
public class Let451 {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        StringBuffer res = new StringBuffer();
        for (int i = s.length(); i >= 0; i--) {
            for (Map.Entry<Character, Integer> item : map.entrySet()) {
                if (item.getValue() == i) {
                    for (int j = 0; j < i; j++) {
                        res.append(item.getKey());
                    }
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("eert"));
    }
}
