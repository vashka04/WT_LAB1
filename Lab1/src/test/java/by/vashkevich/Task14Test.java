package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {
    @Test
    public void Task14() throws Exception {
        boolean ok = true;

        Book original = new Book("WhiteFang", "London", 100, 1);

        Book copy = (Book) original.clone();
        if (!original.toString().equals(copy.toString())) {
            ok = false;
        }

        assertTrue(ok);

    }
}