class Book {
    static String libraryName = "City Central Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            displayLibraryName();
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
}

public class LibrarySystemTest {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "ISBN12345");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN67890");

        book1.displayDetails();
        System.out.println("-------------------");
        book2.displayDetails();
    }
}
