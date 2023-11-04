package by.vashkevich;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N ");
        int N = scanner.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("enter %d element ", i);
            a[i] = scanner.nextInt();
        }

        System.out.println("prime numbers have the following indices:");
        System.out.println(findPrimeNumbers(a));
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> findPrimeNumbers(int[] a) {
        int n = a.length;
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])) indexes.add(i);
        }
        return indexes;
    }

}
