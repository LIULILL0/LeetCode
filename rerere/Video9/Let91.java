package rerere.Video9;

/**
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * <p>
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 */
public class Let91 {
    public int numDecodings(String s) {
        int n =s.length();
        if(s.charAt(0)=='0')
            return 0;
        int[]dp = new int[n];
        dp[0] = 1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)!='0' && Integer.parseInt(s.substring(i-1,i+1))<27){
                dp[i] =i==1?1:dp[i-2];
            }
            if(dp[i]!='0'){
                dp[i] = dp[i] + dp[i-1];
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        Let91 l =new Let91();
        System.out.println(l.numDecodings("12"));
    }
}
