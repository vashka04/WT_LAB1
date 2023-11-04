package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void Task1() {
        double actual = Task1.calculateExpression(1, 1);
        double expected = 1.913410905215903;
        assertEquals(expected, actual);
        boolean isEquals = expected == actual;
        assertEquals(expected, actual, 0.0001);
    }
}