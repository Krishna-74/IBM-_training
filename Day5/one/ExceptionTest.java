package assigment1;

public class ExceptionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0)
			System.out.println("no input received");
		System.out.println("number 1 is :" + Integer.parseInt(args[0]));
		System.out.println("number 2 is :" + Integer.parseInt(args[1]));
		
		try {
			  
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println(x/y);
		}
		catch (NumberFormatException nfe) {
			System.out.println("Only Int are allow");
		} catch (ArithmeticException ae) {
			System.out.println("Division not possible");
		}
		
	}
	}


