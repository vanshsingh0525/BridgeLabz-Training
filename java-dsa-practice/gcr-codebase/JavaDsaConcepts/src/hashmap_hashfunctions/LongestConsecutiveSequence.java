package hashmap_hashfunctions;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        // Step 1: store all elements
        for (int num : arr) {
            map.put(num, true);
        }

        int maxLen = 0;

        // Step 2: find longest sequence
        for (int num : arr) {

            // check if it is start of sequence
            if (!map.containsKey(num - 1)) {

                int currNum = num;
                int count = 1;

                while (map.containsKey(currNum + 1)) {
                    currNum++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(arr));
    }
}

