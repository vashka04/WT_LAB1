package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {
    @Test
    public void Task12() {
        boolean ok = true;

        Book book1 = new Book("WhiteFang", "London", 100, 1);
        Book book2 = new Book("GreenMile", "King", 150, 2);
        Book book3 = new Book("WhiteFang", "London", 100, 3);


        if (book1.hashCode() != 226283047 ||
                book1.equals(book2) ||
                !book1.equals(book3) ||
                !book3.toString().equals("Book{title='WhiteFang', author='London', price=100, edition=0, isbn=3}")
        ) {
            ok = false;
        }

        assertTrue(ok);
    }

}