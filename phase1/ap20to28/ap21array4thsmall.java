package phase1;

import java.util.Arrays;

public class ap21array4thsmall {

    public static int findFourthSmallest(int[] arr) {
        // Check if the array length is less than 4
        if (arr.length < 4) {
            System.out.println("Array length should be at least 4.");
            return -1;
        }

        Arrays.sort(arr);

        // Return the fourth smallest element
        return arr[3];
    }

    public static void main(String[] args) {
        int[] unsortedList = {12, 4, 7, 1, 9, 15, 2, 5};

        // Find the fourth smallest element
        int fourthSmallest = findFourthSmallest(unsortedList);

        if (fourthSmallest != -1) {
            System.out.println("The fourth smallest element in the list is: " + fourthSmallest);
        }
    }
}
