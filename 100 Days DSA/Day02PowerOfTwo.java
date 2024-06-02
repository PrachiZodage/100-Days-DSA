public class Day02PowerOfTwo {

    // Method to check if a number is Power of Two
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        // Creating an instance of Day02PowerOfTwo
        Day02PowerOfTwo solution = new Day02PowerOfTwo();

        // Test Cases
        int testCase1 = 3;
        int testCase2 = 16;
        int testCase3 = 10;

        System.out.println(testCase1 + " is Power of Two: " + solution.isPowerOfTwo(testCase1)); // false
        System.out.println(testCase2 + " is Power of Two: " + solution.isPowerOfTwo(testCase2)); // true
        System.out.println(testCase3 + " is Power of Two: " + solution.isPowerOfTwo(testCase3)); // false

    }
}