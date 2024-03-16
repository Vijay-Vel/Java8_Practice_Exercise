package problemStatement1;

public class Rectangle1 {

	private double length;
    private double width;

    // Default constructor with attributes length and width set to 1
    public Rectangle1() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length with validation
    public void setLength(double length) {
        if (isValidDimension(length)) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Setting length to default value (1.0).");
            this.length = 1.0;
        }
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width with validation
    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Setting width to default value (1.0).");
            this.width = 1.0;
        }
    }

    // Pure member function to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Pure member function to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Private helper function to validate if the dimension is within the valid range
    private boolean isValidDimension(double dimension) {
        return dimension > 0.0 && dimension < 20.0;
    }
}
