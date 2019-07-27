package rerere.Video3;

import java.util.ArrayList;
import java.util.List;

public class Let438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() == 0 || p.length() == 0)
            return list;
        int i = 0, j = p.length();
        while (j <= s.length()) {
            String temp = s.substring(i, j);
            if (isVaild(temp, p)) {
                list.add(i);
            }
            j++;
            i++;
        }
        return list;
    }

    //词频统计
    private boolean isVaild(String temp, String p) {
        int[] a = new int[26];
        for (int i = 0; i < temp.length(); i++) {
            a[temp.charAt(i) - 'a']++;
        }
        for (int j = 0; j < p.length(); j++) {
            a[p.charAt(j) - 'a']--;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                return false;
        }
        return true;
    }
}
