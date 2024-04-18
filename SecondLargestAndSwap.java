//WAP to find the second largest element in a given array and to swap it with the third largest element 

public class SecondLargestAndSwap {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 15}; // Sample array
        
        // Find second largest element

        int secondLargest = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                secondLargest = max;
                max = num;
            } else if (num > secondLargest && num != max) {
                secondLargest = num;
            }
        }
        
        // Find third largest element

        int thirdLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > thirdLargest && num != max & num != secondLargest)
            {
                thirdLargest = num;
            }
        }
        
        // Swap second largest with third largest

        int indexSecond = indexOf(array, secondLargest);
        int indexThird = indexOf(array, thirdLargest);
        if (indexSecond != -1 && indexThird != -1) {
            int temp = array[indexSecond];
            array[indexSecond] = array[indexThird];
            array[indexThird] = temp;
        }
        
        // Print the array after swapping

        System.out.println("Array after swapping:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
    // Function to find index of an element in an array

    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;   // If the element is not found
    }
}

