import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Moby Dick", "Herman Melville", 1851));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));

        // Sorting by title (default)
        Collections.sort(books);
        System.out.println("Sorted by title:");
        books.forEach(System.out::println);

        // Sorting by author
        Collections.sort(books, Book.authorComparator);
        System.out.println("\nSorted by author:");
        books.forEach(System.out::println);

        // Sorting by year (newest first)
        Collections.sort(books, Book.yearComparator);
        System.out.println("\nSorted by year (newest first):");
        books.forEach(System.out::println);

        // Chained sorting (author, then title)
        Collections.sort(books, Book.chainedComparator);
        System.out.println("\nChained sorting (author, then title):");
        books.forEach(System.out::println);
    }
}
