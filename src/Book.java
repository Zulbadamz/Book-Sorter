import java.util.*;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // Implementing Comparable interface for default sorting by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // toString method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }

    // Comparator for sorting by author
    public static Comparator<Book> authorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    };

    // Comparator for sorting by year (newest first)
    public static Comparator<Book> yearComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Integer.compare(b2.getYear(), b1.getYear());
        }
    };

    // Chained Comparator: Sort by author, then by title if authors are the same
    public static Comparator<Book> chainedComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            int authorCompare = b1.getAuthor().compareTo(b2.getAuthor());
            if (authorCompare != 0) {
                return authorCompare;
            }
            return b1.getTitle().compareTo(b2.getTitle());
        }
    };
}

