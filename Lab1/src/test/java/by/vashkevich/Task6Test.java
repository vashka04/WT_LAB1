package by.vashkevich;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void Task6() {
        int[] A = {1, 2, 3, 4};
        int[][] expected = {  {1, 2, 3, 4},
                              {2, 3, 4, 1},
                              {3, 4, 1, 2},
                              {4, 1, 2, 3}  };
        int[][] actual = Task6.createMat(A);
        boolean ok = Arrays.deepEquals(expected, actual);
        assertTrue(ok);
    }
}