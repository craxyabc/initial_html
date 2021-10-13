package digital;

import java.util.*;

public class pyramid {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = 6;
        int previous_add = 16;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {
                String str = String.format("%05d", a);
                System.out.print(str + " ");

                previous_add += 16;

                a += previous_add;
            }
            System.out.println();
        }

    }

}
