//Book class (fields, constructor, getters)
//Main class Solution with:
//Method to count books by a specific author (case-insensitive)
//Logic to find the book with the highest price
//Proper input/output

package oops;


import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of books
        int n = Integer.parseInt(sc.nextLine());
        Book[] books = new Book[n];

        // Input each book
        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());

            books[i] = new Book(id, title, author, price);
        }

        // Input author to search for
        String searchAuthor = sc.nextLine();

        // Task 1: Count books by this author (case-insensitive)
        int count = 0;
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(searchAuthor)) {
                count++;
            }
        }

        // Task 2: Find book with the highest price
        Book mostExpensive = books[0];
        for (int i = 1; i < n; i++) {
            if (books[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = books[i];
            }
        }

        // Output
        if (count > 0) {
            System.out.println("Number of books by " + searchAuthor + ": " + count);
        } else {
            System.out.println("No books found by " + searchAuthor);
        }

        System.out.println("Most expensive book:");
        System.out.println("Id: " + mostExpensive.getId());
        System.out.println("Title: " + mostExpensive.getTitle());
        System.out.println("Author: " + mostExpensive.getAuthor());
        System.out.println("Price: " + mostExpensive.getPrice());

        sc.close();
    }
}
