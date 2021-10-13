package gfg.arrays;

import java.util.*;

public class sort_0_1_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] sorted_arr = sort012(arr);
        for (int i : sorted_arr) {
            System.out.print(i + " ");
        }

    }

    private static int[] sort012(int[] arr) {
        int lo = 0, hi = arr.length - 1, mid = 0;

        while (mid <= hi) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    lo++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = arr[hi];
                    arr[hi] = arr[mid];
                    arr[mid] = temp;
                    hi--;
                    break;
            }
        }

        return arr;
    }

}
