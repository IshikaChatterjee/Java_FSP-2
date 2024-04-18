// WAP in java to find the majority elements in an array using brute force method
// ------MOORE'S VOTING ALGORITHM------

public class majorityelements{
    public static void main(String[] args) {
        // Define the input array
        int[] a = {1, 1, 1, 2, 3, 1};

        // Find the majority elements using brute force approach
        int majorityCount = 0;
        int majorityThreshold = a.length / 2;
        int majorityElement = -1;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > majorityThreshold) {
                majorityCount++;
                majorityElement = a[i];
            }
        }

        // Print the number of majority elements and the majority element

        if (majorityCount > 0) {
            System.out.println("Number of majority elements: " + majorityCount);
            System.out.println("Majority element: " + majorityElement);
        }
        else
        {
            System.out.println("Number of majority element found.");
        }
    }
}

