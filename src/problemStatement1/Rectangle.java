package problemStatement1;

public class Rectangle {
	
	 private double length;
	    private double breadth;

	    // Default constructor
	    public Rectangle() {
	        this.length = 0;
	        this.breadth = 0;
	    }

	    // Parameterized constructor
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    // Accessor methods
	    public double getLength() {
	        return length;
	    }

	    public double getBreadth() {
	        return breadth;
	    }

	    // Mutator methods
	    public void setLength(double length) {
	        this.length = length;
	    }

	    public void setBreadth(double breadth) {
	        this.breadth = breadth;
	    }

	    // Pure function to calculate area
	    public double calculateArea() {
	        return length * breadth;
	    }

	    // Pure function to display information
	    public void displayInfo() {
	        System.out.println("Rectangle Information:");
	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);
	        System.out.println("Area: " + calculateArea());
	        System.out.println();
	    }

}
