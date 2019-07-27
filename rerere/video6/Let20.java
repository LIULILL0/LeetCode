package rerere.video6;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 */
public class Let20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0)
                    return false;
                if (s.charAt(i) == ')') {
                    Character c = stack.pop();
                    if (c != '(') {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    Character c = stack.pop();
                    if (c != '{') {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    Character c = stack.pop();
                    if (c != '[') {
                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }else {

            return false;
        }

    }
}
