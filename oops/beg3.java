//LibraryBook(isbn, title, author, isIssued)
//Tasks
//Count how many books are currently issued (isIssued == true)
//Return the first unissued book (i.e., where isIssued == false)

package oops;

import java.util.Scanner;

class LibraryBook {
    private String isbn;
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor
    public LibraryBook(String isbn, String title, String author, boolean isIssued) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }
}

class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of books
        int n = Integer.parseInt(sc.nextLine());
        LibraryBook[] books = new LibraryBook[n];

        // Input books
        for (int i = 0; i < n; i++) {
            String isbn = sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            boolean isIssued = Boolean.parseBoolean(sc.nextLine());

            books[i] = new LibraryBook(isbn, title, author, isIssued);
        }

        // Count issued books
        int issuedCount = 0;
        for (LibraryBook book : books) {
            if (book.isIssued()) {
                issuedCount++;
            }
        }

        // Find first unissued book
        LibraryBook firstUnissued = null;
        for (LibraryBook book : books) {
            if (!book.isIssued()) {
                firstUnissued = book;
                break;
            }
        }

        // Output
        System.out.println("Total issued books: " + issuedCount);

        if (firstUnissued != null) {
            System.out.println("First unissued book:");
            System.out.println("ISBN: " + firstUnissued.getIsbn());
            System.out.println("Title: " + firstUnissued.getTitle());
            System.out.println("Author: " + firstUnissued.getAuthor());
        } else {
            System.out.println("All books are currently issued.");
        }

        sc.close();
    }
}
