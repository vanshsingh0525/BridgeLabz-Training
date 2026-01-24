package collections.list;

import java.util.*;

public class ReverseList {

    // Reverse ArrayList in-place
    public static <T> void reverseArrayList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // Reverse LinkedList using iterator
    public static <T> List<T> reverseLinkedList(LinkedList<T> list) {
        List<T> reversed = new LinkedList<>();

        ListIterator<T> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            reversed.add(it.previous());
        }
        return reversed;
    }

    public static void main(String[] args) {

        // ArrayList example
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        // LinkedList example
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> reversedLinkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
    }
}
