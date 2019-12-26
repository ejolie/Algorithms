package com.ejolie.easy._1281;

/*
 * 1281. Subtract the Product and Sum of Digits of an Integer
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subtractProductAndSum(234));
    }

    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n != 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
}
