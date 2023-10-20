import java.util.Arrays;

public class Problem3 {
    // Method to calculate the sum of two big numbers
    public static int[] addBigNumbers(int[] num1, int[] num2) {
        int n = Math.max(num1.length, num2.length);
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1, j = num1.length - 1, k = num2.length - 1; i >= 0; i--, j--, k--) {
            int sum = (j >= 0 ? num1[j] : 0) + (k >= 0 ? num2[k] : 0) + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        }

        return result;
    }

    // Method to calculate the difference between two big numbers
    public static int[] subtractBigNumbers(int[] num1, int[] num2) {
        int n = Math.max(num1.length, num2.length);
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1, j = num1.length - 1, k = num2.length - 1; i >= 0; i--, j--, k--) {
            int diff = (j >= 0 ? num1[j] : 0) - (k >= 0 ? num2[k] : 0) - borrow;
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

    // Method to multiply a big number by a digit or another big number
    public static int[] multiplyBigNumbers(int[] num1, int[] num2) {
        int len1 = num1.length;
        int len2 = num2.length;
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            int carry = 0;
            for (int j = len2 - 1; j >= 0; j--) {
                int product = num1[i] * num2[j] + result[i + j + 1] + carry;
                carry = product / 10; // Calculate the carry for the next digit
                result[i + j + 1] = product % 10; // Store the digit
            }
            result[i] += carry; // Add the remaining carry to the current digit
        }

        return removeLeadingZeros(result); // Remove leading zeros from the result
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

    // Helper method to remove leading zeros from an array
    private static int[] removeLeadingZeros(int[] arr) {
        int firstNonZero = 0;
        while (firstNonZero < arr.length && arr[firstNonZero] == 0) {
            firstNonZero++;
        }
        if (firstNonZero == arr.length) {
            return new int[]{0}; // Return [0] if the result is zero
        }
        return Arrays.copyOfRange(arr, firstNonZero, arr.length);
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
        int[] multiplyResult = multiplyBigNumbers(bigNum1, bigNum2);
        System.out.println("Multiplication Result: " + Arrays.toString(multiplyResult));

        // Test case for division
        int[] divideResult = divideBigNumberByDigit(bigNum1, 2);
        System.out.printf("Division Result: %s%n", Arrays.toString(divideResult));

        // Additional test cases
        int[] additionalBigNum1 = {1, 2, 3, 4, 5};
        int[] additionalBigNum2 = {9, 8, 7, 6, 5};
        int[] additionalBigNum3 = {7, 5, 0}; // Represents the number 750
        int[] additionalBigNum4 = {9, 9};    // Represents the number 99
        int[] additionalSumResult = addBigNumbers(additionalBigNum1, additionalBigNum2);
        System.out.println("Additional Sum Result: " + Arrays.toString(additionalSumResult));

        int[] additionalDiffResult = subtractBigNumbers(additionalBigNum1, additionalBigNum2);
        System.out.println("Additional Difference Result: " + Arrays.toString(additionalDiffResult));

        int[] additionalMultiplyResult = multiplyBigNumbers(additionalBigNum1, additionalBigNum2);
        System.out.println("Additional Multiplication Result: " + Arrays.toString(additionalMultiplyResult));

        int[] additionalDivideResult = divideBigNumberByDigit(additionalBigNum2, 3);
        System.out.println("Additional Division Result: " + Arrays.toString(additionalDivideResult));

        int[] additionalMultiplyResult2 = multiplyBigNumbers(additionalBigNum3, additionalBigNum4);
        System.out.println("Additional Multiply Result with 9: " + Arrays.toString(additionalMultiplyResult2));


    }
}
