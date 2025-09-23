public class Main {
    public static void main(String[] args) {
        // Create a book object
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99, true);

        // Display book info
        book1.displayInfo();
        System.out.println();

        // Borrow the book
        book1.borrowBook();
        System.out.println();

        // Try borrowing again
        book1.borrowBook();
        System.out.println();

        // Return the book
        book1.returnBook();
        System.out.println();

        // Try borrowing again after return
        book1.borrowBook();
    }
}
