import java.util.LinkedHashSet;

import java.util.Scanner;

public class random {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            
            // LinkedHashSet to keep unique characters in order (no duplicates)
            LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
            
            // StringBuilder for remaining characters
            StringBuilder remainingChars = new StringBuilder();
            
            // Populate uniqueChars set and find the unique characters in order
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!uniqueChars.contains(c)) {
                    uniqueChars.add(c); // Add to unique characters if not present
                } else {
                    remainingChars.append(c); // Add to remaining if already in uniqueChars
                }
            }
            
            // Create a string of unique characters (each character once)
            StringBuilder uniqueString = new StringBuilder();
            for (Character c : uniqueChars) {
                uniqueString.append(c);
            }
            
            System.out.println( uniqueString);
            System.out.println( remainingChars);
            sc.close();
        }
}
