package gfg.arrays;

import java.util.*;

public class move_negative {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] moved_array = move_negative(arr);
        for (int ar : moved_array) {
            System.out.print(ar + " ");
        }

    }

    private static int[] move_negative(int[] arr) {

        int lo = 0, mid = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else {
                mid++;
            }
        }

        return arr;
    }

}