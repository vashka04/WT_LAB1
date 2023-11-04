package by.vashkevich;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input counts of balls");
        int numberBalls = scanner.nextInt();

        Basket basket = new Basket();

        for (int i = 0; i < numberBalls; i++) {
            System.out.println("input weight of " + i + " ball");
            int weight = scanner.nextInt();
            System.out.println("input color of " + i + " ball");
            scanner.nextLine();
            String ballColor = scanner.nextLine();
            basket.addBall(new Ball(ballColor, weight));
        }

        System.out.println("total weight: " + basket.calcWeight());
        System.out.println("counts of blue balls: " + basket.countColorBalls("blue"));
    }
}
