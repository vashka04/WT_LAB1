package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void Task2() {
        boolean expected = true;
        boolean actual = Task2.checkPoint(1, 1);
        assertEquals(expected, actual);
    }
}