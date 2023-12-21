package sample;
import java.util.Scanner;

public class PrimeFactrization {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to find its prime factors: ");
	        int N = scanner.nextInt();

	        if (N <= 1) {
	            System.out.println("Please enter a number greater than 1.");
	            return;
	        }
	        
	        System.out.println("Prime factors of " + N + ":");
	        for (int i = 2; i * i <= N; i++) {
	            while (N % i == 0) {
	                System.out.println(i);
	                N /= i;
	            }
	        }
	        if (N > 1) {
	            System.out.println(N);
	        }
	    }
	}

