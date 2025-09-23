// Base class
public class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass
public class EBook extends Book {
    private String fileFormat;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Method demonstrating access to ISBN (public) and title (protected)
    public void displayEBookDetails() {
        System.out.println("EBook ISBN (public): " + ISBN);
        System.out.println("EBook Title (protected): " + title);
        System.out.println("EBook File Format: " + fileFormat);
        // Cannot access author directly here as it's private in superclass
        System.out.println("EBook Author (via getter): " + getAuthor());
    }
}
pr