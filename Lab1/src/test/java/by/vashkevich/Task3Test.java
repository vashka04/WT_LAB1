package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void Task3() {
        double[] tg = {1.557407724654902, -2.185039863261519, -0.1425465430742778};
        Task3 task3 = new Task3();

        boolean ok = true;
        int j = 0;
        for (int i = 1; i <= 3; i++) {
            if (tg[j] != Task3.tan(i))
                ok = false;
            j++;
        }
        assertTrue(ok);

    }
}