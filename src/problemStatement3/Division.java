package problemStatement3;

public class Division implements IntegerMath {

	@Override
	public void operation(int a, int b) {
		// TODO Auto-generated method stub
		if (b != 0) {
            System.out.println("Division result: " + (a / b));
            
        } else {
            System.out.println("Cannot divide by zero");
           
        }
	}

}
