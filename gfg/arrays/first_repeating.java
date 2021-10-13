package gfg.arrays;

import java.util.*;

public class first_repeating {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("first_repeating : " + first_repeating(arr));
        System.out.println("first_occurrence_repeating : " + first_occurrence_repeating(arr));

    }

    private static int first_occurrence_repeating(int[] arr) {
        int repeat = -1;

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                repeat = arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        return repeat;
    }

    private static int first_repeating(int[] arr) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);

        }

        return -1;
    }

}
