package by.vashkevich;

import java.util.Scanner;
import static java.lang.Math.*;



public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x ");
        double x = scanner.nextInt();
        System.out.println("enter y ");
        double y = scanner.nextInt();
        System.out.println(calculateExpression(x, y));
    }



    public static double calculateExpression(double x, double y) {
        return (1 + pow(sin(x + y), 2)) / (2 + abs(x - (2 * x) / (1 + pow(x, 2) * pow(y, 2)))) + x;
    }
}
