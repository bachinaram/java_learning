import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeLength {
    public static int longestPalindrome(String s) {
        // Count occurrences of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Calculate the length of the longest palindrome
        int length = 0;
        boolean hasOddCount = false;

        for (int count : charCount.values()) {
            length += (count / 2) * 2; // Include even counts
            if (count % 2 != 0) {
                hasOddCount = true; // Mark if there is an odd count
            }
        }

        // Add one for a character with an odd count (can be placed in the middle)
        if (hasOddCount) {
            length += 1;
        }

        return length;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abccccdd";
        int result = longestPalindrome(input);
        System.out.println("Length of the longest palindrome: " + result);
    }
}