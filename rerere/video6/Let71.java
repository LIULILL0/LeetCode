package rerere.video6;

import java.util.Stack;

/**
 * 以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。
 *
 * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径
 *
 * 请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）不能以 / 结尾。此外，规范路径必须是表示绝对路径的最短字符串。
 *
 *
 *
 * 示例 1：
 *
 * 输入："/home/"
 * 输出："/home"
 * 解释：注意，最后一个目录名后面没有斜杠。
 */
public class Let71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");

        for (String s : str) {
            if ("".equals(s) || ".".equals(s) || (("..".equals(s)) && stack.isEmpty()))
                continue;
            else if ("..".equals(s) && !stack.isEmpty())
                stack.pop();
            else {
                stack.push(s);
            }

        }
        if (stack.isEmpty())
            return "/";
        StringBuilder sb = new StringBuilder();
        for (String a : stack) {
            sb.append("/" + a);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Let71 l =new Let71();
        System.out.println(l.simplifyPath("/home//foo/"));
    }
}
