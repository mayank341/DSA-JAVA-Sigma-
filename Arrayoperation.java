import java.util.Arrays;
import java.util.Scanner;

public class Arrayoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Creating and Initializing an Array
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("1. Original Array: " + Arrays.toString(arr));

        // 2. Insertion (manually modifying elements)
        arr[2] = 99; // Changing 3rd element
        System.out.println("2. After Insertion at index 2: " + Arrays.toString(arr));

        // 3. Taking Input from User
        int[] userArray = new int[3];
        System.out.println("3. Enter 3 elements:");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = sc.nextInt();
        }
        System.out.println("   User Input Array: " + Arrays.toString(userArray));

        // 4. Output using for loop
        System.out.print("4. Output using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 5. Searching an Element
        int key = 40;
        boolean found = false;
        for (int val : arr) {
            if (val == key) {
                found = true;
                break;
            }
        }
        System.out.println("5. Searching " + key + ": " + (found ? "Found" : "Not Found"));

        // 6. Maximum and Minimum
        int max = arr[0], min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("6. Max: " + max + ", Min: " + min);

        // 7. Sum and Average
        int sum = 0;
        for (int val : arr) sum += val;
        double average = (double) sum / arr.length;
        System.out.println("7. Sum: " + sum + ", Average: " + average);

        // 8. Reverse the Array
        int[] reversed = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < reversed.length / 2; i++) {
            int temp = reversed[i];
            reversed[i] = reversed[reversed.length - 1 - i];
            reversed[reversed.length - 1 - i] = temp;
        }
        System.out.println("8. Reversed Array: " + Arrays.toString(reversed));

        // 9. Copying an Array
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("9. Copied Array: " + Arrays.toString(copy));

        // 10. Sorting an Array
        int[] unsorted = {5, 2, 8, 1, 3};
        Arrays.sort(unsorted);
        System.out.println("10. Sorted Array: " + Arrays.toString(unsorted));

        // 11. Traversing using for-each loop
        System.out.print("11. For-each Traversal: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();

    
    }
}

