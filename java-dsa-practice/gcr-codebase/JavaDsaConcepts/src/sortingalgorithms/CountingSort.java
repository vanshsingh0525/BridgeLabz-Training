package sortingalgorithms;

public class CountingSort {

    // Public counting sort method
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (stable sort)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy sorted data back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    // Public main method
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 14, 18, 10, 13, 15};

        countingSort(ages, 10, 18);

        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}

