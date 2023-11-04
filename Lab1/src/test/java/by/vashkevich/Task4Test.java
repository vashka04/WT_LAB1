package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void Task4() {
        int[] arr = {2, 7, 9, 15, 17};
        boolean[] check = {true, true, false, false, true};
        int arrLength = arr.length;
        boolean ok = true;

        for (int i = 0; i < arrLength; i++) {
            if (Task4.isPrime(arr[i]) != check[i]) {
                ok = false;
            }
        }
        assertTrue(ok);
    }
}