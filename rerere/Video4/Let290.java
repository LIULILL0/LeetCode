package rerere.Video4;

import java.util.HashMap;

/**
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 * <p>
 * 这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 * <p>
 * 示例1:
 * <p>
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 */
public class Let290 {
    public boolean wordPattern(String pattern, String str) {
//        char[] c = pattern.toCharArray();
//        String[] s = str.split(" ");
//        if (c.length != s.length)
//            return false;
//        HashMap<Character, String> map = new HashMap<>();
//        for (int i = 0; i < s.length; i++) {
//            if (map.containsKey(c[i])) {
//                if (!map.get(c[i]).equals(s[i])) {
//                    return false;
//                }
//            } else {
//                if(map.containsValue(s[i]))
//                    return false;
//                map.put(c[i], s[i]);
//            }
//        }
//        return true;


        String[] s = str.split(" ");
        if (pattern.length() != s.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(s[i]))
                    return false;
                map.put(pattern.charAt(i), s[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(s[i]))
                    return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        Let290 l = new Let290();
        System.out.println(l.wordPattern("abba", "dog dog dog dog"));
    }
}
