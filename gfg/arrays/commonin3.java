package gfg.arrays;

import java.util.*;

public class commonin3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }

        int n3 = s.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = s.nextInt();
        }

        common_in_3(arr1, arr2, arr3, n1, n2, n3);

    }

    private static void common_in_3(int[] arr1, int[] arr2, int[] arr3, int n1, int n2, int n3) {
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

    }

}
