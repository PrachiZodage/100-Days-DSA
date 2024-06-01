public class Day01PalindromeNumber {

    // Method to check if a number is a palindrome
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int rev_num = 0;
        int n = x;

        // Reversing the number
        while (n > 0) {
            int digit = n % 10;
            rev_num = rev_num * 10 + digit;
            n = n / 10;
        }

        // Checking if the reversed number is the same as the original
        return rev_num == x;
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        // Creating an instance of Day01PalindromeNumber
        Day01PalindromeNumber solution = new Day01PalindromeNumber();

        // Test cases
        int test1 = 121;
        int test2 = -121;
        int test3 = 10;

        // Printing the results of the test cases
        System.out.println(test1 + " is palindrome: " + solution.isPalindrome(test1)); // Output: true
        System.out.println(test2 + " is palindrome: " + solution.isPalindrome(test2)); // Output: false
        System.out.println(test3 + " is palindrome: " + solution.isPalindrome(test3)); // Output: false
    }
}
