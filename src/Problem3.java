import java.util.Arrays;

public class Problem3 {
    // Method to calculate the sum of two big numbers
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

    // Method to calculate the difference between two big numbers
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

    // Method to multiply a big number by a digit
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

    // Method to divide a big number by a digit
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

    // Method to test various cases
    public static void tests(int[] bigNum1, int[] bigNum2) {
        // Test case for addition
        int[] sumResult = addBigNumbers(bigNum1, bigNum2);
        System.out.println("Sum Result: " + Arrays.toString(sumResult));

        // Test case for subtraction
        int[] diffResult = subtractBigNumbers(bigNum1, bigNum2);
        System.out.println("Difference Result: " + Arrays.toString(diffResult));

        // Test case for multiplication
        int[] multiplyResult = multiplyBigNumberByDigit(bigNum1, 2);
        System.out.println("Multiplication Result: " + Arrays.toString(multiplyResult));

        // Test case for division
        int[] divideResult = divideBigNumberByDigit(bigNum1, 2);
        System.out.println("Division Result: " + Arrays.toString(divideResult));

        // Additional test cases
        int[] additionalBigNum1 = {1, 2, 3, 4, 5};
        int[] additionalBigNum2 = {9, 8, 7, 6, 5};
        int[] additionalSumResult = addBigNumbers(additionalBigNum1, additionalBigNum2);
        System.out.printf("Additional Sum Result: %s%n", Arrays.toString(additionalSumResult));

        int[] additionalDiffResult = subtractBigNumbers(additionalBigNum1, additionalBigNum2);
        System.out.printf("Additional Difference Result: %s%n", Arrays.toString(additionalDiffResult));

        int[] additionalMultiplyResult = multiplyBigNumberByDigit(additionalBigNum1, 3);
        System.out.printf("Additional Multiplication Result: %s%n", Arrays.toString(additionalMultiplyResult));

        int[] additionalDivideResult = divideBigNumberByDigit(additionalBigNum2, 3);
        System.out.printf("Additional Division Result: %s%n", Arrays.toString(additionalDivideResult));
    }
}
