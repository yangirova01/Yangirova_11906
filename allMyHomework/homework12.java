package allMyHomework;

import java.util.Scanner;
public class homework12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        int[] a = new int[n];
        int[] b = new int[m];
        int max = 10000;
        while (i < n) {
            a[i] = scanner.nextInt();
            i++;
        }
        i = 0;
        while (i < m) {
            b[i] = scanner.nextInt();
            i++;
        }
        if (b[m - 1] > a[n - 1]) {
            max = b[m - 1];
        } else {
            max = a[n - 1];
        }

        int[] c = new int[max + 1];
        i = 0;
        while (i < n) {
            c[a[i]]++;
            i++;
        }
        i = 0;
        while (i < m) {
            c[b[i]]++;
            i++;
        }
        int in = 0;
        int[] result1 = new int[max + 1];
        i = 0;
        while (i < result1.length) {
            if (c[i] >= 2) {
                result1[i] = i;
                i++;
            }
            i++;
        }
        i = 0;
        while (i < max) {
            if (result1[i] != 0) {
                System.out.print(result1[i] + " ");
            }
            i++;
        }
        System.out.println();

        //Log OR
        i = 0;
        in = 0;
        int[] result2 = new int[n + m + 1];
        while (i < c.length) {
            if (c[i] >= 1) {
                result2[in] = i;
                in++;
            }
            i++;
        }
        i = 0;
        while (i < result2.length) {
            if (result2[i] != 0) {
                System.out.print(result2[i] + " ");
            }
            i++;
        }
        System.out.println(result2);
    }
}