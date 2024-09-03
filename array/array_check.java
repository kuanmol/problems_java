package array;

class ArrayConditionsChecker {

    public boolean checkArrayConditions(int[] arr, int threshold) {
        return checkArrayConditions(arr, 0, threshold);
    }

    private boolean checkArrayConditions(int[] arr, int index, int threshold) {
        // Base case: If we reach the end of the array, return true
        if (index >= arr.length) {
            return true;
        }

        // Check conditions for the current element at index
        boolean condition1 = arr[index] > 0;            // Element is positive
        boolean condition2 = arr[index] % 2 == 0;       // Element is even
        boolean condition3 = arr[index] < threshold;    // Element is less than the threshold

        // Combine conditions using && operator
        return condition1 && condition2 && condition3 && checkArrayConditions(arr, index + 1, threshold);
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7};
        int[] arr3 = {10, 20, 30, 40};

        ArrayConditionsChecker checker = new ArrayConditionsChecker();

        // Check conditions for arr1 (all elements are positive, even, and less than 10)
        boolean result1 = checker.checkArrayConditions(arr1, 10);
        System.out.println("Conditions for arr1: " + result1);  // Output: true

        // Check conditions for arr2 (not all elements are even)
        boolean result2 = checker.checkArrayConditions(arr2, 10);
        System.out.println("Conditions for arr2: " + result2);  // Output: false

        // Check conditions for arr3 (all elements are positive, even, and less than 50)
        boolean result3 = checker.checkArrayConditions(arr3, 50);
        System.out.println("Conditions for arr3: " + result3);  // Output: true
    }
}
