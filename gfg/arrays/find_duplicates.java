package gfg.arrays;

import java.util.*;

public class find_duplicates {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        find_duplicate(arr);

    }

    private static void find_duplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], (map.get(arr[i]) + 1));
            }
        }

        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            if (value.getValue() > 1) {
                System.out.print(value.getKey() + " ");
            }
        }

    }

}
