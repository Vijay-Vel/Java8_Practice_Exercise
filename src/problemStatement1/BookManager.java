package problemStatement1;

import java.util.Scanner;

public class BookManager {
	
	public static Book[] createBooks(int n) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            books[i] = new Book();
            System.out.println("Enter information for Book " + (i + 1) + ":");
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            books[i].setBookTitle(title);

            System.out.print("Enter book price: ");
            double price = scanner.nextDouble();
            books[i].setBookPrice(price);

            // Consume the newline character left in the buffer
            scanner.nextLine();
        }

        scanner.close();
        return books;
    }

    // Pure function to display the books along with their description
    public static void showBooks(Book[] books) {
        System.out.println("Book Title\t\tPrice");
        for (Book book : books) {
            System.out.println(book.getBookTitle() + "\t\tRs " + book.getBookPrice());
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of books: ");
	        int n = scanner.nextInt();

	        // Create n objects of Book
	        Book[] books = createBooks(n);

	        // Display the books along with their description
	        showBooks(books);

	        scanner.close();
	}

}
