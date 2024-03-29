package rerere.Video4;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 */
public class Let242 {
    public boolean isAnagram(String s, String t) {
        int[] number = new int[26];
        for (int i = 0; i < s.length(); i++) {
            number[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            number[t.charAt(i) - 'a']--;
        }
        int temp = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]!=0)
                return false;
        }
        return true;

    }
}
