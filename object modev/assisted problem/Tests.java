import java.util.*;

class Book {
    String title, author;
    Book(String t, String a) { title = t; author = a; }
    void show() { System.out.println(title + " by " + author); }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();
    Library(String name) { this.name = name; }
    void add(Book b) { books.add(b); }
    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) b.show();
    }
}

public class Tests {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "Orwell");
        Book b2 = new Book("Alchemist", "Coelho");
        Book b3 = new Book("Mockingbird", "Lee");

        Library l1 = new Library("City Library");
        Library l2 = new Library("School Library");

        l1.add(b1); l1.add(b2);
        l2.add(b2); l2.add(b3);

        l1.showBooks(); System.out.println(); l2.showBooks();
    }
}
