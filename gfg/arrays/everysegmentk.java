package gfg.arrays;

import java.util.*;

public class everysegmentk {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();
        int k = s.nextInt();

        System.out.println(segmentk(arr, value, k));

    }

    private static boolean segmentk(int[] arr, int value, int k) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i += k) {
            if (arr.length % k == 0) {
                for (int j = 0; j < k; j++) {
                    if (arr[i + j] == value) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            } else {
                int a = arr.length % k;
                for (int j = 0; j < k; j++) {
                    if (arr[i + j] == value) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }

}
