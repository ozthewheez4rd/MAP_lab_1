public class Problem4 {
    public static int getCheapestKeyboard(int[] keyboardPrices) {
        int minPrice = Integer.MAX_VALUE;
        for (int price : keyboardPrices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    public static int getMostExpensiveItem(int[] keyboardPrices, int[] usbPrices) {
        int maxKeyboardPrice = findMax(keyboardPrices);
        int maxUsbPrice = findMax(usbPrices);
        return Math.max(maxKeyboardPrice, maxUsbPrice);
    }

    public static int getMostExpensiveUsbDrive(int[] usbPrices, int budget) {
        int maxUsbPrice = Integer.MIN_VALUE;
        for (int price : usbPrices) {
            if (price <= budget && price > maxUsbPrice) {
                maxUsbPrice = price;
            }
        }
        return maxUsbPrice;
    }

    public static int calculateTotalCost(int budget, int[] keyboardPrices, int[] usbPrices) {
        int cheapestKeyboard = getCheapestKeyboard(keyboardPrices);
        int maxUsbDrive = getMostExpensiveUsbDrive(usbPrices, budget - cheapestKeyboard);

        if (maxUsbDrive != Integer.MIN_VALUE) {
            return cheapestKeyboard + maxUsbDrive;
        }
        return -1;
    }

    public static void tests(int[] keyboardPrices, int[] usbPrices, int budget) {
        // Test case for cheapest keyboard
        int cheapestKeyboard = getCheapestKeyboard(keyboardPrices);
        System.out.println("Cheapest Keyboard: " + cheapestKeyboard);

        // Test case for most expensive item
        int mostExpensiveItem = getMostExpensiveItem(keyboardPrices, usbPrices);
        System.out.println("Most Expensive Item: " + mostExpensiveItem);

        // Test case for most expensive USB drive
        int mostExpensiveUsbDrive = getMostExpensiveUsbDrive(usbPrices, budget);
        System.out.println("Most Expensive USB Drive: " + mostExpensiveUsbDrive);

        // Test case for calculating total cost
        int totalCost = calculateTotalCost(budget, keyboardPrices, usbPrices);
        if (totalCost != -1) {
            System.out.println("Total Cost: " + totalCost);
        } else {
            System.out.println("Markus cannot buy both items with the given budget.");
        }
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
}
