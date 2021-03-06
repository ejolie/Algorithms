package com.ejolie.problems.easy._766;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 766. Toeplitz Matrix
 */
public class Solution {
    public static void main(String[] args) {
        assertTrue(isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
        assertFalse(isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}}));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
