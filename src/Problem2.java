public class Problem2 {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxSum(int[] arr) {
        int max = findMax(arr);
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum - max;
    }

    public static int findMinSum(int[] arr) {
        int min = findMin(arr);
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum - min;
    }

    public static void tests(int[] numbers) {
        // Test case for maximum number
        int maxNum = findMax(numbers);
        System.out.println("Max Number: " + maxNum);

        // Test case for minimum number
        int minNum = findMin(numbers);
        System.out.println("Min Number: " + minNum);

        // Test case for maximum sum of n-1 numbers
        int maxSum = findMaxSum(numbers);
        System.out.println("Max Sum of n-1 Numbers: " + maxSum);

        // Test case for minimum sum of n-1 numbers
        int minSum = findMinSum(numbers);
        System.out.println("Min Sum of n-1 Numbers: " + minSum);
    }
}
