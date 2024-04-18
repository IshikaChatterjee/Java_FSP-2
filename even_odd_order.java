// WAP to sort all the even positioned elements in the ascending oorder and odd positioned elements in descending order in an array

import java.util.Arrays;

public class even_odd_order {
    public static void main(String[] args) {
        // Define the input array
        int[] array = {3, 8, 2, 6, 5, 4, 7, 1};

        // Separate even and odd positioned elements
        int[] evenPositioned = new int[(array.length + 1) / 2];
        int[] oddPositioned = new int[array.length / 2];

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenPositioned[i / 2] = array[i];
            } else {
                oddPositioned[i / 2] = array[i];
            }
        }

        // Sort even-positioned elements in ascending order
        Arrays.sort(evenPositioned);

        // Sort odd-positioned elements in descending order
        for (int i = 0; i < oddPositioned.length / 2; i++) {
            int temp = oddPositioned[i];
            oddPositioned[i] = oddPositioned[oddPositioned.length - 1 - i];
            oddPositioned[oddPositioned.length - 1 - i] = temp;
        }

        // Merge the sorted even and odd-positioned elements back into the original array
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = evenPositioned[i / 2];
            } else {
                array[i] = oddPositioned[i / 2];
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
