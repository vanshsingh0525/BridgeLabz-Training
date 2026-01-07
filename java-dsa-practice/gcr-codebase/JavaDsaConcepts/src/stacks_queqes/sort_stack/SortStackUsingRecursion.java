package stacks_queqes.sort_stack;

import java.util.Stack;

class SortStackUsingRecursion {

    // Function to sort the stack
    static void sortStack(Stack<Integer> st) {
        if (st.isEmpty())
            return;

        int temp = st.pop();
        sortStack(st);
        sortedInsert(st, temp);
    }

    // Function to insert element in sorted order
    static void sortedInsert(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        sortedInsert(st, x);
        st.push(temp);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(30);
        st.push(10);
        st.push(20);
        st.push(5);

        sortStack(st);

        System.out.println("Sorted Stack:");
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}

