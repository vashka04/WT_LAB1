package by.vashkevich;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x ");
        int x = scanner.nextInt();
        System.out.println("enter y ");
        int y = scanner.nextInt();
        System.out.println(checkPoint(x, y));

    }

    public static boolean checkPoint(int x, int y) {
        return ((x <= 6) && (x >= -6) && (y >= -3) && (y < 0)) || ((x <= 4) && (x >= -4) && (y >= 0) && (y <= 5));
    }

}
