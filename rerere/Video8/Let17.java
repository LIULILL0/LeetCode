package rerere.Video8;

import java.util.ArrayList;
import java.util.List;

public class Let17 {
    private String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };
    ArrayList<String> res;

    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if (digits.equals(" "))
            return res;


        findLetter(digits, 0, "");
        return res;
    }

    private void findLetter(String digits, int index, String str) {
        if (index == digits.length() ) {
            res.add(str);
            return;
        }
        char c = digits.charAt(index);
        String letters = letterMap[c-'0'];
        for (int i = 0; i < letters.length(); i++) {
            findLetter(digits,index+1,str+letters.charAt(i));
        }
        return;
    }

    public static void main(String[] args) {
        Let17 l =new Let17();
        System.out.println(l.letterCombinations("23"));
    }
}
