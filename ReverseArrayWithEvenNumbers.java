public class ReverseArrayWithEvenNumbers {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverseArrayWithEvenNumbers(array);
        // Print the reversed array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArrayWithEvenNumbers(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // If both elements are odd, swap them
            if (array[start] % 2 != 0 && array[end] % 2 != 0) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
            // If one element is even and the other is odd, don't swap
            else if (array[start] % 2 == 0 && array[end] % 2 != 0) {
                start++;
            } else if (array[start] % 2 != 0 && array[end] % 2 == 0) {
                end--;
            }
            // If both elements are even, move to the next pair
            else {
                start++;
                end--;
            }
        }
    }
}
