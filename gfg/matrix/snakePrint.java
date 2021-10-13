package gfg.matrix;

import java.util.*;

public class snakePrint {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        ArrayList<Integer> list = snakePrint(arr);
        for (int li : list) {
            System.out.print(li + " ");
        }
    }

    private static ArrayList<Integer> snakePrint(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    list.add(arr[i][j]);
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    list.add(arr[i][j]);
                }
            }

        }

        return list;
    }

}
