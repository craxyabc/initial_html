package gfg.matrix;

import java.util.*;

public class difference_diagonals {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println(absolute_difference(arr));

    }

    private static int absolute_difference(int[][] arr) {

        int sum_major = 0, sum_minor = 0;

        for (int i = 0; i < arr.length; i++) {
            sum_major += arr[i][i];
            sum_minor += arr[i][arr.length - i - 1];
        }

        return Math.abs(sum_major - sum_minor);
    }

}
