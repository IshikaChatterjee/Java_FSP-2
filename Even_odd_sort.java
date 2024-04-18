// WAP to sort all the even positioned elements in the ascending oorder and odd positioned elements in descending order in an array using swap approach

public class Even_odd_sort {
    public static void main(String[] args) {
        int[] array = {7, 12, 3, -8, 2, 0, 19, 2, 27, 16};


        for (int i = 0; i < array.length; i += 2) {
            for (int j = i + 2; j < array.length; j += 2) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


        for (int i = 1; i < array.length; i += 2) {
            for (int j = i + 2     ; j < array.length; j += 2) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int num : array) System.out.print(num + " ");
    }
}
