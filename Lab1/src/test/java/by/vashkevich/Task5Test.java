package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void Task5() {
        int[] arr = {1, 2, 5, 3, 4, 0,11,9,10};
        int expected = 4;
        int actual = Task5.findMinDelete(arr);
        assertEquals(expected, actual);
    }
}