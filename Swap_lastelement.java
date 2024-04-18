import java.util.ArrayList;

public class Swap_lastelement  {
    public static void main(String[] args) {
        // Define the input list
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(-4);
        a.add(5);
        a.add(7);

        // Initialize indices for the last positive element and first negative element
        int lastPositiveIndex = -1;
        int firstNegativeIndex = -1;

        // Find the last positive element and the first negative element
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0) {
                lastPositiveIndex = i;
            } else if (firstNegativeIndex == -1) {
                firstNegativeIndex = i;
            }
        }

        // Swap the negative element with the last positive element
        if (lastPositiveIndex != -1 && firstNegativeIndex != -1) {
            int temp = a.get(lastPositiveIndex);
            a.set(lastPositiveIndex, a.get(firstNegativeIndex));
            a.set(firstNegativeIndex, temp);
        }

        // Print the modified list
        System.out.println("Input: a [] = " + a);
    }
}

