package rerere.Video4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 */
public class Let49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String flag = String.valueOf(chars);
            List<String> list = null;
            if(map.containsKey(flag)){
               list = map.get(flag);
           }else {
               list = new ArrayList<>();

           }
            list.add(s);
            map.put(flag,list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Let49 l = new Let49();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(l.groupAnagrams(str));
    }
}
