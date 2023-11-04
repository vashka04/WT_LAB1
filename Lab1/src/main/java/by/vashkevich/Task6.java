package by.vashkevich;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N:");
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("enter %d element", i);
            a[i] = scanner.nextInt();
        }

        int[][] mat = createMat(a);
        printMat(mat);
    }

    public static int[][] createMat(int[] a) {
        int N = a.length;
        int[][] matrix = new int[N][N];
        int shift = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = a[(j + shift) % N];
            }
            shift++;
        }
        return matrix;
    }

    public static void printMat(int[][] mat) {
        int N = mat.length;
        for (int[] ints : mat) {
            for (int j = 0; j < N; j++) System.out.print(ints[j] + " ");
            System.out.println();
        }
    }

}
