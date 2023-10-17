public class Problem3 {
    public static int[] addBigNumbers(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        return result;
    }

    public static int[] subtractBigNumbers(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }

    public static int[] multiplyBigNumberByDigit(int[] num, int digit) {
        int n = num.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        return result;
    }

    public static int[] divideBigNumberByDigit(int[] num, int digit) {
        int n = num.length;
        int[] result = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int dividend = num[i] + remainder * 10;
            result[i] = dividend / digit;
            remainder = dividend % digit;
        }

        return result;
    }

    public static void tests(int[] bigNum1, int[] bigNum2) {
        // Test case for addition
        int[] sumResult = addBigNumbers(bigNum1, bigNum2);
        System.out.println("Sum Result: " + arrayToString(sumResult));

        // Test case for subtraction
        int[] diffResult = subtractBigNumbers(bigNum1, bigNum2);
        System.out.println("Difference Result: " + arrayToString(diffResult));

        // Test case for multiplication
        int[] multiplyResult = multiplyBigNumberByDigit(bigNum1, 2);
        System.out.println("Multiplication Result: " + arrayToString(multiplyResult));

        // Test case for division
        int[] divideResult = divideBigNumberByDigit(bigNum1, 2);
        System.out.println("Division Result: " + arrayToString(divideResult));
    }

    private static String arrayToString(int[] arr) {
        // Utility method for formatting arrays to strings
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
