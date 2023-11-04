package by.vashkevich;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {
    @Test
    public void Task16() {
        boolean ok = true;

        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "A", 30, 3));
        books.add(new Book("A", "C", 10, 2));
        books.add(new Book("B", "B", 20, 1));

        int i = 0;
        String[] sortedTitle = {"Book{title='A', author='C', price=10, edition=0, isbn=2}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='C', author='A', price=30, edition=0, isbn=3}"};
        String[] sortedTitleAuthor = {"Book{title='A', author='C', price=10, edition=0, isbn=2}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='C', author='A', price=30, edition=0, isbn=3}"};
        String[] sortedAuthorTitle = {"Book{title='C', author='A', price=30, edition=0, isbn=3}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='A', author='C', price=10, edition=0, isbn=2}"};
        String[] sortedAuthorTitlePrice = {"Book{title='C', author='A', price=30, edition=0, isbn=3}",
                "Book{title='B', author='B', price=20, edition=0, isbn=1}",
                "Book{title='A', author='C', price=10, edition=0, isbn=2}"};

        Collections.sort(books, new Book.TitleComparator());
        for (Book book : books) {
            if (!book.toString().equals(sortedTitle[i])) {
                ok = false;
                break;
            }
            i++;
        }

        i = 0;
        Collections.sort(books, new Book.TitleAuthorComparator());
        for (Book book : books) {
            if (!book.toString().equals(sortedTitleAuthor[i])) {
                ok = false;
                break;
            }
            i++;
        }

        i = 0;
        Collections.sort(books, new Book.AuthorTitleComparator());
        for (Book book : books) {
            if (!book.toString().equals(sortedAuthorTitle[i])) {
                ok = false;
                break;
            }
            i++;
        }

        i = 0;
        Collections.sort(books, new Book.AuthorTitlePriceComparator());
        for (Book book : books) {
            if (!book.toString().equals(sortedAuthorTitlePrice[i])) {
                ok = false;
                break;
            }
            i++;
        }

        assertTrue(ok);
    }

}