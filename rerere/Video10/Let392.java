package rerere.Video10;

public class Let392 {
    public boolean isSubsequence(String s, String t) {
        int si = s.length() - 1;
        int ti = t.length() - 1;
        int s1 = 0;
        int t1 = 0;
        while (s1 <= si && t1 <= ti) {
            if (s.charAt(s1) == t.charAt(t1)) {
                s1++;
                t1++;
            } else {
                t1++;
            }
        }
        if (s1 >= si)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Let392 l = new Let392();
        System.out.println(l.isSubsequence("abc", ""));
    }
}
