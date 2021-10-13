package gfg.arrays;

import java.util.*;

public class frequency {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();

        // System.out.println(frequency_itrative(arr, x));
        System.out.println(frequency_hashmap(arr, x));
    }

    private static int frequency_hashmap(int[] arr, int x) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int a = map.get(arr[i]) + 1;
                map.put(arr[i], a);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map.get(x);
    }

    private static int frequency_itrative(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
        }
        return count;
    }

}
