package functionalprogram;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of rows (M): ");
	        int M = scanner.nextInt();

	        System.out.print("Enter the number of columns (N): ");
	        int N = scanner.nextInt();

	        int[][] array = new int[M][N];
	        System.out.println("Enter the elements of the 2D array:");

	        for (int i = 0; i < M; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.print("Enter element at position (" + i + ", " + j + "): ");
	                array[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.println("\n2D Array:");
	        printTwoDArray(array);
	    }
	    
	    private static void printTwoDArray(int[][] array) {
	        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out), true);

	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                printWriter.print(array[i][j] + "\t");
	            }
	            printWriter.println();
	        }
	    }
	}

