package rerere.Video3;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 */
public class Let125 {
    public boolean isPalindrome(String s) {
        char[] ch = s.toLowerCase().toCharArray();
        int low = 0;
        int high = ch.length - 1;
        while (high >= low) {
            while ((ch[low] > 'z' || (ch[low] < 'a')) && (ch[low] < '0' || ch[low] > '9')) {
                if (low >= high)
                    return true;
                low++;
            }
            while ((ch[high] > 'z' || (ch[high] < 'a')) && (ch[high] < '0' || ch[high] > '9')) {
                high--;
            }
            if (ch[low] == ch[high]) {
                low++;
                high--;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Let125 l = new Let125();
        System.out.println(l.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
