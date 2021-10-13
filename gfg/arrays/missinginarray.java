package gfg.arrays;

import java.util.*;

public class missinginarray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(findmissing(arr));
    }

    private static int findmissing(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;

        int array_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            array_sum += arr[i];
        }

        return (sum - array_sum);
    }

}
