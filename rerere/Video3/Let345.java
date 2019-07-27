package rerere.Video3;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "holle"
 */
public class Let345 {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (end >= start) {
            while (ch[start] != 'a' && ch[start] != 'e' && ch[start] != 'i' && ch[start] != 'o' && ch[start] != 'u' & ch[start] != 'A' &&ch[start] != 'E' &&ch[start] != 'I'&&ch[start] != 'O'&&ch[start] != 'U') {
                start++;
                if(start>=end)
                    return String.valueOf(ch);
            }
            while (ch[end] != 'a' && ch[end] != 'e' && ch[end] != 'i' && ch[end] != 'o' && ch[end] != 'u'&&ch[end] != 'A' && ch[end] != 'E' && ch[end] != 'I' && ch[end] != 'O' && ch[end] != 'U') {
                end--;
            }
            if(end>=start){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                end--;
                start++;
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        Let345 l =new Let345();
        System.out.println(l.reverseVowels("hello"));
    }

}
