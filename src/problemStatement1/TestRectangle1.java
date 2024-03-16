package problemStatement1;

import java.util.Scanner;

public class TestRectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Create a Rectangle object
        Rectangle1 rectangle = new Rectangle1();

        // Input and set length
        System.out.print("Enter length (between 0.0 and 20.0): ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        // Input and set width
        System.out.print("Enter width (between 0.0 and 20.0): ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        // Display information
        System.out.println("Rectangle Information:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        scanner.close();

	}

}
