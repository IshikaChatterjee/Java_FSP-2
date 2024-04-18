//Input: a [] = [7, -2, 3, 4, -8, 12]
//Output: a [] = [-2, -8, 7, 3, 4, 12]

import java.util.ArrayList;
import java.util.Collections;

public class negativearraylistsorting {
    public static void main(String[] args) {
        // Define the input list
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(-2);
        a.add(3);
        a.add(4);
        a.add(-8);
        a.add(12);

        // Separate negative and positive numbers
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int num : a) {
            if (num < 0) {
                negativeNumbers.add(num);
            } else {
                positiveNumbers.add(num);
            }
        }

        // Sort the negative numbers in descending order

        Collections.sort(negativeNumbers,Collections.reverseOrder());

        // Combine the negative and positive numbers
        ArrayList<Integer> sortedA = new ArrayList<>();
        sortedA.addAll(negativeNumbers);
        sortedA.addAll(positiveNumbers);

        // Print the sorted list
        System.out.println("Input: a [] = " + a);
        System.out.println("Output: a [] = " + sortedA);
    }
}

