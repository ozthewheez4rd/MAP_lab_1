public class Problem2 {
    // Method to find the maximum number in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the minimum number in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method to find the maximum sum of n-1 numbers in an array
    public static int findMaxSum(int[] arr) {
        int max = findMax(arr);
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum - max;
    }

    // Method to find the minimum sum of n-1 numbers in an array
    public static int findMinSum(int[] arr) {
        int min = findMin(arr);
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum - min;
    }

//    // Method to test various cases
//    public static void tests(int[] numbers) {
//        // Test case for maximum number
//        int maxNum = findMax(numbers);
//        System.out.println("Max Number: " + maxNum);
//
//        // Test case for minimum number
//        int minNum = findMin(numbers);
//        System.out.println("Min Number: " + minNum);
//
//        // Test case for maximum sum of n-1 numbers
//        int maxSum = findMaxSum(numbers);
//        System.out.println("Max Sum of n-1 Numbers: " + maxSum);
//
//        // Test case for minimum sum of n-1 numbers
//        int minSum = findMinSum(numbers);
//        System.out.println("Min Sum of n-1 Numbers: " + minSum);
//
//        // Additional test cases
//        int[] additionalNumbers = {7, 3, 10, 2, 1, 8};
//        int additionalMaxNum = findMax(additionalNumbers);
//        System.out.println("Additional Max Number: " + additionalMaxNum);
//
//        int additionalMinNum = findMin(additionalNumbers);
//        System.out.println("Additional Min Number: " + additionalMinNum);
//
//        int additionalMaxSum = findMaxSum(additionalNumbers);
//        System.out.println("Additional Max Sum of n-1 Numbers: " + additionalMaxSum);
//
//        int additionalMinSum = findMinSum(additionalNumbers);
//        System.out.println("Additional Min Sum of n-1 Numbers: " + additionalMinSum);
//    }
}
