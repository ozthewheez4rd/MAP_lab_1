public class Problem4 {
    // Method to return the cheapest keyboard price
    public static int getCheapestKeyboard(int[] keyboardPrices) {
        int minPrice = Integer.MAX_VALUE;
        for (int price : keyboardPrices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    // Method to return the most expensive item price (keyboard or USB drive)
    public static int getMostExpensiveItem(int[] keyboardPrices, int[] usbPrices) {
        int maxKeyboardPrice = findMax(keyboardPrices);
        int maxUsbPrice = findMax(usbPrices);
        return Math.max(maxKeyboardPrice, maxUsbPrice);
    }

    // Method to find the most expensive USB drive Markus can buy with a given budget
    public static int getMostExpensiveUsbDrive(int[] usbPrices, int budget) {
        int maxUsbPrice = Integer.MIN_VALUE;
        for (int price : usbPrices) {
            if (price <= budget && price > maxUsbPrice) {
                maxUsbPrice = price;
            }
        }
        return maxUsbPrice;
    }

    // Method to find Markus' budget and the total price of items
    public static int calculateTotalCost(int budget, int[] keyboardPrices, int[] usbPrices) {
        int cheapestKeyboard = getCheapestKeyboard(keyboardPrices);
        int maxUsbDrive = getMostExpensiveUsbDrive(usbPrices, budget - cheapestKeyboard);

        if (maxUsbDrive != Integer.MIN_VALUE) {
            return cheapestKeyboard + maxUsbDrive;
        }
        return -1; // Return -1 if Markus cannot afford both items
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to test various cases
//    public static void tests(int[] keyboardPrices, int[] usbPrices, int budget) {
//        // Test case for the cheapest keyboard
//        int cheapestKeyboard = getCheapestKeyboard(keyboardPrices);
//        System.out.println("Cheapest Keyboard: " + cheapestKeyboard);
//
//        // Test case for the most expensive item (keyboard or USB drive)
//        int mostExpensiveItem = getMostExpensiveItem(keyboardPrices, usbPrices);
//        System.out.println("Most Expensive Item: " + mostExpensiveItem);
//
//        // Test case for the most expensive USB drive Markus can buy
//        int mostExpensiveUsbDrive = getMostExpensiveUsbDrive(usbPrices, budget);
//        System.out.println("Most Expensive USB Drive Markus Can Buy: " + mostExpensiveUsbDrive);
//
//        // Test case for calculating Markus' budget and total cost
//        int totalCost = calculateTotalCost(budget, keyboardPrices, usbPrices);
//        if (totalCost != -1) {
//            System.out.println("Total Cost: " + totalCost);
//        } else {
//            System.out.println("Markus cannot buy both items with the given budget.");
//        }
//
//        // Additional test cases
//        int[] additionalKeyboardPrices = {25, 30, 15, 40};
//        int[] additionalUsbPrices = {20, 10, 35, 25};
//        int additionalBudget = 50;
//
//        int additionalCheapestKeyboard = getCheapestKeyboard(additionalKeyboardPrices);
//        System.out.println("Additional Cheapest Keyboard: " + additionalCheapestKeyboard);
//
//        int additionalMostExpensiveItem = getMostExpensiveItem(additionalKeyboardPrices, additionalUsbPrices);
//        System.out.println("Additional Most Expensive Item: " + additionalMostExpensiveItem);
//
//        int additionalMostExpensiveUsbDrive = getMostExpensiveUsbDrive(additionalUsbPrices, additionalBudget);
//        System.out.println("Additional Most Expensive USB Drive Markus Can Buy: " + additionalMostExpensiveUsbDrive);
//
//        int additionalTotalCost = calculateTotalCost(additionalBudget, additionalKeyboardPrices, additionalUsbPrices);
//        if (additionalTotalCost != -1) {
//            System.out.println("Additional Total Cost: " + additionalTotalCost);
//        } else {
//            System.out.println("Markus cannot buy both items with the given additional budget.");
//        }
//
//        // Additional test case where Markus cannot buy both items
//        int[] lowBudgetKeyboardPrices = {20, 30};
//        int[] lowBudgetUsbPrices = {25, 15};
//        int lowBudget = 30;
//
//        int lowBudgetTotalCost = calculateTotalCost(lowBudget, lowBudgetKeyboardPrices, lowBudgetUsbPrices);
//        if (lowBudgetTotalCost != -1) {
//            System.out.println("Total Cost with Low Budget: " + lowBudgetTotalCost);
//        } else {
//            System.out.println("Markus cannot buy both items with the given low budget.");
//        }
//    }
}


