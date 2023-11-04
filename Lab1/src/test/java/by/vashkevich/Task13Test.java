package by.vashkevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {
    @Test
    void Task13() {
        boolean ok = true;

        ProgrammerBook book1 = new ProgrammerBook("CleanCode", "Martin", 100, 1, "ru", 1);
        ProgrammerBook book2 = new ProgrammerBook("Web-Design", "Krug", 150, 2, "en", 3);
        ProgrammerBook book3 = new ProgrammerBook("CleanCode", "Martin", 100, 3, "ru", 1);


        if (book1.hashCode() != 720944359 ||
                book1.equals(book2) ||
                !book1.equals(book3) ||
                !book2.toString().equals("Book{title='Web-Design', author='Krug', price=150, edition=0, language='en', level=3}")
        ) {
            ok = false;
        }

        assertTrue(ok);
    }

}