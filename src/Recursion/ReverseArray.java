public class ReverseArray {

    public static void reverseArray(int[] arr) {
        // Call the recursive helper method with the full array bounds
        reverseArrayRecursive(arr, 0, arr.length - 1);
    }

    private static void reverseArrayRecursive(int[] arr, int start, int end) {
        // Base case: if start meets or passes end, we're done
        if (start >= end) {
            return;
        }

        // Swap the elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with updated bounds (move inward)
        reverseArrayRecursive(arr, start + 1, end - 1);
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(array);

        reverseArray(array);

        System.out.println("Reversed array:");
        printArray(array);
    }
}