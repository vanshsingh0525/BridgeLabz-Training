package sorting.tailorshop;

public class InsertionSortUtil {

    // Sort orders based on deadline (ascending → earliest first)
    public static void insertionSort(Order[] orders) {

        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;

            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = key;
        }
    }
}
