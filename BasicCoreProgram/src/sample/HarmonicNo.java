package sample;
import java.util.Scanner;

public class HarmonicNo {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the Harmonic Value N (N should be a non-zero integer): ");
	        int N = scanner.nextInt();
	        
	        if (N == 0) {
	            System.out.println("N should be a non-zero integer.");
	            return;
	        }
	        
	        double harmonicNumber = 0.0;
	        for (int i = 1; i <= N; i++) {
	            harmonicNumber += 1.0 / i;
	        }

	        System.out.println("The " + N + "th Harmonic Number is: " + harmonicNumber);
	    }
	}

