package gfg.arrays;

import java.util.*;

public class subarray_0_sum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(if_subarray_0_sum(arr));

    }

    private static boolean if_subarray_0_sum(int[] arr) {

        Set<Integer> set = new HashSet<Integer>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }

        return false;
    }

}
