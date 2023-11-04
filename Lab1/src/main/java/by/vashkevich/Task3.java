package by.vashkevich;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a ");
        int a = scanner.nextInt();
        System.out.println("enter b ");
        int b = scanner.nextInt();
        System.out.println("enter h ");
        int h = scanner.nextInt();
        calculateFunction(a, b, h);

    }
    public static double tan(int x) {
        return sin(x) / cos(x);
    }
    public static void calculateFunction(int a, int b, int h){
        for (int i = a; i <= b; i += h) {
            System.out.printf("%d   %.3f\n", i, tan(i));
        }
    }


}
