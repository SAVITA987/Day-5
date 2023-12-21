package sample;
import java.util.Scanner;

public class QuotientAndRemainder {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the Dividend: ");
	        int dividend = scanner.nextInt();
	        
	        System.out.print("Enter the Divisor: ");
	        int divisor = scanner.nextInt();

	        if (divisor == 0) {
	            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
	            return;
	        }

	        int quotient = dividend / divisor;
	        int remainder = dividend % divisor;

	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);

	    }
	}

