package by.vashkevich;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void Task8() {
        int[] A = {1, 4, 8};
        int[] B = {2, 5, 10, 11};
        int[] expected = {1, 2, 4, 5, 8, 10, 11};
        int[] actual = Task8.merge(A, B);
        boolean ok = Arrays.equals(expected, actual);
        assertTrue(ok);
    }
}