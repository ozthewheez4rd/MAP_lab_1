import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testProblem1();
        testProblem2();
        testProblem3();
        testProblem4();
    }

    // Assertion tests for Problem 1
    public static void testProblem1() {
        int[] grades1 = {84, 29, 56, 38, 41};
        int[] insufficientGrades1 = Problem1.getInsufficientGrades(grades1);
        assert insufficientGrades1.length == 3; // Check if 3 grades are insufficient

        int[] grades2 = {84, 29, 56, 38, 41};
        double averageGrade2 = Problem1.getAverageGrade(grades2);
        assert Math.abs(averageGrade2 - 49.6) < 1e-9; // Check if the average is approximately 49.6

        int[] grades3 = {84, 29, 56, 38, 41};
        int[] roundedGrades3 = Problem1.getRoundedGrades(grades3);
        assert roundedGrades3.length == 5; // Check if the array has the same length as the input

        int[] grades4 = {84, 29, 56, 38, 41};
        int maxRoundedGrade4 = Problem1.getMaximumRoundedGrade(grades4);
        assert maxRoundedGrade4 == 85; // Check if the max rounded grade is 85
    }

    // Assertion tests for Problem 2
    public static void testProblem2() {
        int[] numbers1 = {4, 8, 3, 10, 17};
        int maxNumber1 = Problem2.findMax(numbers1);
        assert maxNumber1 == 17; // Check if the max number is 17

        int[] numbers2 = {4, 8, 3, 10, 17};
        int minNumber2 = Problem2.findMin(numbers2);
        assert minNumber2 == 3; // Check if the min number is 3

        int[] numbers3 = {4, 8, 3, 10, 17};
        int maxSum3 = Problem2.findMaxSum(numbers3);
        assert maxSum3 == 39; // Check if the max sum is 39

        int[] numbers4 = {4, 8, 3, 10, 17};
        int minSum4 = Problem2.findMinSum(numbers4);
        assert minSum4 == 25; // Check if the min sum is 25
    }

    // Assertion tests for Problem 3
    public static void testProblem3() {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] sumResult = Problem3.addBigNumbers(num1, num2);
        assert Arrays.equals(sumResult, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}); // Check if the sum is correct

        int[] diffResult = Problem3.subtractBigNumbers(num1, num2);
        assert Arrays.equals(diffResult, new int[]{2, 9, 0, 0, 0, 0, 0, 0, 0}); // Check if the difference is correct

        int[] multiplyResult = Problem3.multiplyBigNumbers(num1, num2);
        assert Arrays.equals(multiplyResult, new int[]{9, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}); // Check if the multiplication is correct
        int[] multiplyResultTheWeirdOne = Problem3.multiplyBigNumbers(new int[] {9}, new int[] {9});
        assert Arrays.equals(multiplyResultTheWeirdOne, new int[]{8, 1});

        int[] divideResult = Problem3.divideBigNumberByDigit(num1, 2);
        assert Arrays.equals(divideResult, new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}); // Check if the division is correct
    }

    // Assertion tests for Problem 4
    public static void testProblem4() {
        int[] keyboardPrices = {40, 35, 70, 15, 45};
        int cheapestKeyboard = Problem4.getCheapestKeyboard(keyboardPrices);
        assert cheapestKeyboard == 15; // Check if the cheapest keyboard price is 15

        int[] usbDrivePrices = {20, 15, 40, 15};
        int mostExpensiveItem = Problem4.getMostExpensiveItem(keyboardPrices, usbDrivePrices);
        assert mostExpensiveItem == 40; // Check if the most expensive item is a USB drive with a price of 40

        int[] usbDrivePrices2 = {15, 45, 20};
        int maxUsbDrive = Problem4.getMostExpensiveUsbDrive(usbDrivePrices2, 30);
        assert maxUsbDrive == 20; // Check if the most expensive USB drive Markus can buy with a budget of 30 is 20

        int budget = 60;
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int totalSpent = Problem4.calculateTotalCost(budget, keyboards, usbDrives);
        assert totalSpent == 50 + 8; // Check if the total amount spent is 50 + 8 = 58
    }
}
