package pangram;

import java.util.*;

public class Pangram_Program {
	public static void main(String[] args) {
		
		//Taking Input From User Using Scanner Class
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence: ");
	        String input = sc.nextLine();
	        sc.close();

	        if (isPangram(input)) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String input) {
	        // Create a boolean array to mark the presence of each letter in the alphabet
	        boolean[] alphabetPresent = new boolean[26];

	        // Convert the input to Lower-case to make it case-insensitive
	        input = input.toLowerCase();

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                int index = c - 'a';
	                alphabetPresent[index] = true;
	            }
	        }

	        // Check if all letters from 'a' to 'z' are present
	        for (boolean present : alphabetPresent) {
	            if (!present) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

    // example Input : The quick brown fox jumps over the lazy dog
	// Output : The input is a pangram.

