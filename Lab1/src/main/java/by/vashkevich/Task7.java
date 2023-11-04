package by.vashkevich;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("enter %d element ", i);
            a[i] = scanner.nextInt();
        }
        sort(a);
        System.out.println("sorted array is: " + Arrays.toString(a));
    }
    public static int[] sort(int[] a) {
        int n = a.length;
        boolean swap;
        do {
            swap = false;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    swap = true;
                }
            }
            n--;
        } while (swap);
        return a;
    }
}
