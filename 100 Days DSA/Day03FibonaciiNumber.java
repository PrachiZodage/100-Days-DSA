public class Day03FibonaciiNumber {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 2; i <= n; i++) {
            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        return secondNumber;

    }

    public static void main(String[] args) {

        Day03FibonaciiNumber solution = new Day03FibonaciiNumber();

        int testCase1 = 3;
        int testCase2 = 5;
        int testCase3 = 2;

        System.out.println("Input :" + testCase1);
        System.out.println("Output :" + solution.fib(testCase1));

        System.out.println("Input :" + testCase2);
        System.out.println("Output :" + solution.fib(testCase2));

        System.out.println("Input :" + testCase3);
        System.out.println("Output :" + solution.fib(testCase3));

    }
}
