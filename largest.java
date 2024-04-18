import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};
        Arrays.sort(array);
        int n = array.length;
        
        int largest1 = array[n - 1];
        int largest2 = array[n - 2];
        int largest3 = array[n - 3];
        
        System.out.println("Largest three elements are: " + largest1 + ", " + largest2 + ", " + largest3);
    }
}
