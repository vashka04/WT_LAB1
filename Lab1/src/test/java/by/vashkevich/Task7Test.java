package by.vashkevich;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void Task7() {
        int[] A = {5, 3, 4, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = Task7.sort(A);
        boolean ok = Arrays.equals(expected, actual);
        assertTrue(ok);
    }
}