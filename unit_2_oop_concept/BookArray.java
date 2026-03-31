package unit_2_oop_concept;

class Book {
    String title;
    Book(String t) { title = t; }

    void show() { System.out.println(title); }
}

public class BookArray {
    public static void main(String[] args) {
        Book[] b = {
            new Book("Java"),
            new Book("DSA")
        };

        for (Book x : b) {
            x.show();
        }
    }
}