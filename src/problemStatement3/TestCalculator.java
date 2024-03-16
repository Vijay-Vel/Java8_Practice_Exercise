package problemStatement3;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Use Lambda Expressions with multiple parameters to implement the IntegerMath interface
        // and create instances of each operation class
        IntegerMath addition = (a, b) -> System.out.println("Addition is: " + (a + b));
        IntegerMath subtraction = (a, b) -> System.out.println("Subtraction is: " + (a - b));
        IntegerMath multiplication = (a, b) -> System.out.println("Multiplication is: " + (a * b));
        IntegerMath division = (a, b) -> {
            if (b != 0) {
                System.out.println("Division is: " + (a / b));
            } else {
                System.out.println("Cannot divide by zero");
            }
        };

        // Using behavior parameterization with Calculator class
        Calculator calculator = new Calculator();
        calculator.calculate(20, 10, addition);
        calculator.calculate(20, 10, subtraction);
        calculator.calculate(20, 10, multiplication);
        calculator.calculate(20, 10, division);
    }

}
