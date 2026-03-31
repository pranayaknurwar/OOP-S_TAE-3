package unit_1_classes_objects;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isbn.equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }
}

public class Lirary_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // fix for nextLine issue

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    lib.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = sc.nextLine();
                    lib.removeBook(removeIsbn);
                    break;

                case 3:
                    lib.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        
    }
}