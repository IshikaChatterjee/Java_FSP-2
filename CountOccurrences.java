import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

    
        int[] array = new int[size];


        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.println("Enter the number N: ");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > n) {
                count++;
            }
        }

    
        System.out.println("The number of occurrences of numbers greater than " + n + " is " + count);
    }
}