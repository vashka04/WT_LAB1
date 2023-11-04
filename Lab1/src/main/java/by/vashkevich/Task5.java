package by.vashkevich;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N ");
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("enter %d element ", i);
            a[i] = scanner.nextInt();
        }
        System.out.println("delete " + findMinDelete(a) + " elements");
    }

    public static int findMinDelete(int[] a) {
        int n = a.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1)  dp[i] = dp[j] + 1;
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > max) max = dp[i];
        }
        return n - max;
    }

}
