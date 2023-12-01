package phase1;

import java.util.Scanner;

public class ap22arrayrange {

    public static int sumInRange(int[] arr, int L, int R) {
        int sum = 0;

        // Validate the range L and R
        if (L < 0 || R >= arr.length || L > R) {
            System.out.println("Invalid range. Please enter valid indices within 0 to n-1.");
            return -1;
        }

        // Calculate the sum of elements in the given range
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] elements = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of L: ");
        int L = scanner.nextInt();

        System.out.print("Enter the value of R: ");
        int R = scanner.nextInt();

        int result = sumInRange(elements, L, R);

        if (result != -1) {
            System.out.println("Sum of elements in range L to R: " + result);
        }

        scanner.close();
    }
}
