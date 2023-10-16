import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Problem 1: Java University Grades
        int[] grades = {84, 29, 55, 38, 45};

        // Test case for insufficient grades
        int[] insufficientGrades = getInsufficientGrades(grades);
        System.out.println("Insufficient Grades: " + arrayToString(insufficientGrades));

        // Test case for average grade
        double averageGrade = getAverageGrade(grades);
        System.out.println("Average Grade: " + averageGrade);

        // Test case for rounded grades
        int[] roundedGrades = getRoundedGrades(grades);
        System.out.printf("Rounded Grades: %s%n", arrayToString(roundedGrades));

        // Test case for maximum rounded grade
        int maxRoundedGrade = getMaximumRoundedGrade(grades);
        System.out.println("Max Rounded Grade: " + maxRoundedGrade);

        //Problem 2: Array Operations
        int[] numbers = {4, 8, 3, 10, 17};

        //Test case for max number
        int maxNum = findMax(numbers);
        System.out.println("Max Number: " + maxNum);

        // Test case for min number
        int minNum = findMin(numbers);
        System.out.println("Min Number: " + minNum);

        // Test case for max sum of n-1 numbers
        int maxSum = findMaxSum(numbers);
        System.out.println("Max Sum of n-1 Numbers: " + maxSum);

        // Test case for min sum of n-1 numbers
        int minSum = findMinSum(numbers);
        System.out.println("Min Sum of n-1 Numbers: " + minSum);

        // Problem 3: BigNumber Operations
        int[] bigNum1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNum2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        // Test case for addition of big numbers
        int[] sumResult = addBigNumbers(bigNum1, bigNum2);
        System.out.println("Sum Result: " + arrayToString(sumResult));

        // Test case for subtraction of big numbers
        int[] diffResult = subtractBigNumbers(bigNum1, bigNum2);
        System.out.println("Difference Result: " + arrayToString(diffResult));

        // Test case for multiplication of a big number by a digit
        int[] multiplyResult = multiplyBigNumberByDigit(bigNum1, 2);
        System.out.println("Multiplication Result: " + arrayToString(multiplyResult));

        // Test case for division of a big number by a digit
        int[] divideResult = divideBigNumberByDigit(bigNum1, 2);
        System.out.println("Division Result: " + arrayToString(divideResult));
    }
    public static int[] getInsufficientGrades(int[] grades) {
        List<Integer> insufficientGrades = new ArrayList<>();

        for (int grade : grades) {
            if (grade < 40) {
                insufficientGrades.add(grade);
            }
        }

        int[] result = new int[insufficientGrades.size()];
        for (int i = 0; i < insufficientGrades.size(); i++) {
            result[i] = insufficientGrades.get(i);
        }

        return result;
    }

    public static double getAverageGrade(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int nextMultipleOf5 = (grades[i] + 4) / 5 * 5;
                if (nextMultipleOf5 - grades[i] < 3) {
                    roundedGrades[i] = nextMultipleOf5;
                } else {
                    roundedGrades[i] = grades[i];
                }
            } else {
                roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }

    public static int getMaximumRoundedGrade(int[] grades) {
        int[] roundedGrades = getRoundedGrades(grades);
        int maxRoundedGrade = 0;
        for (int grade : roundedGrades) {
            if (grade > maxRoundedGrade) {
                maxRoundedGrade = grade;
            }
        }
        return maxRoundedGrade;
    }
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMaxSum(int[] arr) {
        int sum = 0;
        int max = findMax(arr);
        for (int num : arr) {
            if (num != max) {
                sum += num;
            }
        }
        return sum;
    }

    public static int findMinSum(int[] arr) {
        int sum = 0;
        int min = findMin(arr);
        for (int num : arr) {
            if (num != min) {
                sum += num;
            }
        }
        return sum;
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
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



}
