package problemStatement1;

import java.util.Scanner;

public class TestRectangle {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 5 Rectangle objects
        Rectangle[] rectangles = new Rectangle[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for Rectangle " + (i + 1) + ":");
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();

            System.out.print("Enter breadth: ");
            double breadth = scanner.nextDouble();

            rectangles[i] = new Rectangle(length, breadth);
        }

        // Display information and calculate area for each rectangle
        for (int i = 0; i < 5; i++) {
            rectangles[i].displayInfo();
        }

        scanner.close();
    }

}
