package by.vashkevich;

public class Task14 {
    public static void main(String[] args) {
        Book original = new Book("WhiteFang", "London", 100, 1);

        try {
            Book copy = (Book) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Copy: " + copy.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
