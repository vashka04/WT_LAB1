package by.vashkevich;

public class Task13 {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("CleanCode", "Martin", 100, 1, "ru", 1);
        ProgrammerBook book2 = new ProgrammerBook("Web-Design", "Krug", 150, 2, "en", 3);
        ProgrammerBook book3 = new ProgrammerBook("CleanCode", "Martin", 100, 3, "ru", 1);

        System.out.println(book1.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book2.toString());
    }
}
