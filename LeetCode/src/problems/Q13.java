package problems;
/*
 * 13. Roman to Integer
 * Easy
 */

/*
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    IV, IX : 4, 9
    XL, XC : 40, 90
    CD, CM : 400, 900
*/
import java.util.Map;
import java.util.HashMap;

public class Q13 {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
    }

    public static int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = helper(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = helper(s.charAt(i + 1));
                if (next > curr) {
                    res -= curr;
                    continue;
                }
            }
            res += curr;
        }
        return res;
    }

    public static int helper(char c) {
        if (c == 'I')
            return 1;
        else if (c == 'V')
            return 5;
        else if (c == 'X')
            return 10;
        else if (c == 'L')
            return 50;
        else if (c == 'C')
            return 100;
        else if (c == 'D')
            return 500;
        else
            return 1000;
    }
}