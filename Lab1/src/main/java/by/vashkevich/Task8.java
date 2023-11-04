package by.vashkevich;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("enter %d element of A array :", i);
            a[i] = scanner.nextInt();
        }

        System.out.println("enter m ");
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("enter %d element of B array ", i);
            b[i] = scanner.nextInt();
        }
        int[] mergeArr = merge(a, b);
        System.out.println(Arrays.toString(mergeArr));
    }
    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] mergedArr = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                mergedArr[k] = a[i];
                i++;
            } else {
                mergedArr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            mergedArr[k] = a[i];
            i++;
            k++;
        }

        while (j < m) {
            mergedArr[k] = b[j];
            j++;
            k++;
        }

        return mergedArr;
    }
}
