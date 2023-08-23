package TechInt;

import java.util.Optional;

public class Library {
    public Optional<String> findBook(String bookTitle) {
        if (bookTitle.equals("The Adventures of Java")) {
            return Optional.of("You found the book!");
        } else {
            return Optional.empty(); // No book found
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Optional<String> bookResult = library.findBook("The Adventures of Java");
        if (bookResult.isPresent()) {
            System.out.println(bookResult.get());
        } else {
            System.out.println("Sorry, the book was not found.");
        }
    }
}
