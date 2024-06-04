public class Day04TribonacciNumber {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 1;

        for (int i = 1; i <= n; i++) {
            int fourthTerm = firstTerm + secondTerm + thirdTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fourthTerm;
        }

        return firstTerm;

    }

    public static void main(String[] args) {

        Day04TribonacciNumber solution = new Day04TribonacciNumber();

        int testCase1 = 3;
        int testCase2 = 5;
        int testCase3 = 2;

        System.out.println("Input :" + testCase1);
        System.out.println("Output :" + solution.tribonacci(testCase1));

        System.out.println("Input :" + testCase2);
        System.out.println("Output :" + solution.tribonacci(testCase2));

        System.out.println("Input :" + testCase3);
        System.out.println("Output :" + solution.tribonacci(testCase3));

    }
}
