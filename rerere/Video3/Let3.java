package rerere.Video3;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Let3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<1)
            return 0;
        int l = 0, r = -1;
        int res = 0;
        int[] m = new int[256];
        while (l < s.length()) {
            if ((r + 1) < s.length() && (m[s.charAt(r + 1)] == 0)) {
                r++;
                m[s.charAt(r)]++;
            } else {
                m[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Let3 l = new Let3();
        System.out.println(l.lengthOfLongestSubstring("pwwkew"));
    }
}
