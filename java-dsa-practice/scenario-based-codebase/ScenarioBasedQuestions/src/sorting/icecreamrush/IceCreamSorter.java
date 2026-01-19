package sorting.icecreamrush;

public class IceCreamSorter {

    public void bubbleSort(String[] flavors, int[] sales) {
        int n = sales.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (sales[j] > sales[j + 1]) {
                    // swap sales
                    int tempSales = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSales;

                    // swap flavors
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }
    }
}
