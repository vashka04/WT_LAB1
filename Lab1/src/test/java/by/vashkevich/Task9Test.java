package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    @Test
    void Task9() {
        int[] weight = {5, 89, 23, 34, 1};
        String[] ballColor = {"blue", "red", "black", "blue", "blue"};
        boolean ok = true;

        Basket basket = new Basket();
        for (int i = 0; i < 5; i++) {
            basket.addBall(new Ball(ballColor[i], weight[i]));
        }
        if (basket.calcWeight() != 152 || basket.countColorBalls("blue") != 3) {
            ok = false;
        }

        assertTrue(ok);
    }

}