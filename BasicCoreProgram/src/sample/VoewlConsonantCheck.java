package sample;
import java.util.Scanner;

public class VoewlConsonantCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an alphabet: ");
	        char ch = scanner.next().charAt(0);

	        // Check if the character is an alphabet
	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	        	
	            // Check if the alphabet is a vowel or a consonant
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                System.out.println(ch + " is a vowel.");
	            } else {
	                System.out.println(ch + " is a consonant.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a valid alphabet.");
	        }
	    }
	}

