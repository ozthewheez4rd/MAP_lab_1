public class Main {
    public static void main(String[] args) {
        // Problem 1: Java University Grades
        int[] grades = {84, 29, 55, 38, 45};
        Problem1.tests(grades);

        // Problem 2: Array Operations
        int[] numbers = {4, 8, 3, 10, 17};
        Problem2.tests(numbers);

        // Problem 3: BigNumber Operations
        int[] bigNum1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNum2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        Problem3.tests(bigNum1, bigNum2);

        // Problem 4: Electronics Shop
        int[] keyboardPrices = {40, 35, 70, 15, 45};
        int[] usbPrices = {20, 15, 40, 15};
        int budget = 60;
        Problem4.tests(keyboardPrices, usbPrices, budget);
    }
}
