package gfg.arrays;

import java.util.*;

public class max_product {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(max_product(arr));
    }

    private static int max_product(int[] arr) {
        int max_current = Integer.MIN_VALUE;
        int max_after = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                max_after *= arr[i];
                if (max_current < max_after) {
                    max_current = max_after;
                }
            }
        }

        return max_current;
    }

}
