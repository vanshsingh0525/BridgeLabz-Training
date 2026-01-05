package sortingalgorithms;

public class QuickSort {

    // Public method to perform partition
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // pivot element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot with element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Public Quick Sort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Public main method
    public static void main(String[] args) {
        int[] prices = {1200, 500, 1500, 800, 300};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}

