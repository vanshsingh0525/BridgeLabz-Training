package hashmap_hashfunctions;

import java.util.HashMap;

public class CheckSum {

    public static boolean hasPair(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if (map.containsKey(need)) {
                System.out.println("Pair found: " + need + " + " + arr[i] + " = " + target);
                return true;
            }

            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        boolean result = hasPair(arr, target);
        System.out.println(result);
    }
}

