package sample;
import java.util.Scanner;

public class SwapNo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Display numbers before swapping
	        System.out.println("Before swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        // Swap the numbers
	        int temp = num1;
	        num1 = num2;
	        num2 = temp;

	        // Display numbers after swapping
	        System.out.println("\nAfter swapping:");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	    }
	}

