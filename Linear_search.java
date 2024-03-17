public class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element equals the target, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 25, 30, 45, 50, 65};
        // Element to search for
        int target = 30;

        // Perform linear search
        int index = linearSearch(arr, target);

        // Check if the target is found
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
