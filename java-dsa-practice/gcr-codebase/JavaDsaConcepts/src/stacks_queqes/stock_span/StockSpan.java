package stacks_queqes.stock_span;

import java.util.Stack;

class StockSpan {

    static void calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> st = new Stack<>();

        // First day span is always 1
        st.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {

            // Pop while current price is higher
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());

            st.push(i);
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        calculateSpan(price);
    }
}

