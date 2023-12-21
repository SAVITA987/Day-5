package sample;

public class PowerOf2 {
	
	    public static void main(String[] args) {
	        if (args.length != 1) {
	            System.out.println("Please provide a valid command-line argument N.");
	            return;
	        }
	        int N = Integer.parseInt(args[0]);

	        if (N < 0 || N >= 31) {
	            System.out.println("N should be in the range 0 <= N < 31.");
	            return;
	        }

	        System.out.println("Powers of 2 up to 2^" + N + ":");
	        for (int i = 0; i <= N; i++) {
	            int powerOf2 = (int) Math.pow(2, i);
	            System.out.println("2^" + i + " = " + powerOf2);
	        }
	    }
	}

