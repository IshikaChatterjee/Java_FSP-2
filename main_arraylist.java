// WAP in java to sort the positive elements in an array in ascending order 

import java.util.ArrayList;
import java.util.Collections;

public class main_arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(-2);
        a.add(3);
        a.add(4);
        a.add(-8);
        a.add(12);

        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int num : a) {
            if (num < 0) {
                negativeNumbers.add(num);
            } else {
                positiveNumbers.add(num);
            }
        }

    
        Collections.sort(positiveNumbers);

        ArrayList<Integer> sortedA = new ArrayList<>();
        sortedA.addAll(negativeNumbers);
        sortedA.addAll(positiveNumbers);

        System.out.println(sortedA);
    }
}
