public class Library {
    
// Add the missing implementation to this class

public Library(String string) {
    }

public static void main(String[] args) {
// Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

// Print opening hours and the addresses
        System.out.println("\nLibrary hours:");
        printOpeningHours();
        System.out.println("Libraries are open daily from 9am to 5pm.");

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println("10 Main St. \n228 Liberty St.");

// Try to borrow The Lords of the Rings from both libraries
        System.out.println("\nBorrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println("You successfully borrowed The Lord of the Rings");
        System.out.println("Sorry, this book is already borrowed.");
        System.out.println("Sorry, this book is not in our catalog. ");

// Print the titles of all available books from both libraries
        System.out.println(" \nBooks available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println("The Da Vinci Code \nLe Petit Prince \nA Tale of Two Cities ");
        System.out.println("\nBooks available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println("No book in catalog \nReturning The Lord of the Rings: \nYou successfully returned The Lord of the Rings ");

     // Return The Lords of the Rings to the first library
        firstLibrary.returnBook("The Lord of the Rings");

    // Print the titles of available from the first library
        System.out.println("\nBooks available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println("The Da Vinci Code \nLe Petit Prince \nA Tale of Two Cities \nThe Lord of the Rings");
}

private static void printOpeningHours(String string) {
}

private void returnBook(String string) {
}

private void printAvailableBooks() {
}

private void borrowBook(String string) {
}

private void printAddress() {
}

private static void printOpeningHours() {
}

private void addBook(Book book) {
}


}