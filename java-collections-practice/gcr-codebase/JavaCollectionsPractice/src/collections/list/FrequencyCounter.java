package collections.list;

import java.util.*;

public class FrequencyCounter {

    public static Map<String, Integer> countFrequency(List<String> list) {

        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {

        List<String> input =
                Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = countFrequency(input);

        System.out.println(result); 
    }
}
