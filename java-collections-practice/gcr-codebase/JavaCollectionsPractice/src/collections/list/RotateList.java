package collections.list;

import java.util.*;

public class RotateList {

    // Left rotate list by k positions
    public static <T> void rotateLeft(List<T> list, int k) {

        int n = list.size();
        if (n == 0) return;

        // Handle rotations greater than list size
        k = k % n;

        // Temporary list to store first k elements
        List<T> temp = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            temp.add(list.get(i));
        }

        // Shift remaining elements to the left
        for (int i = k; i < n; i++) {
            list.set(i - k, list.get(i));
        }

        // Add stored elements to the end
        for (int i = 0; i < temp.size(); i++) {
            list.set(n - k + i, temp.get(i));
        }
    }

    public static void main(String[] args) {

        List<Integer> list =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        rotateLeft(list, 2);

        System.out.println(list); 
    }
}
