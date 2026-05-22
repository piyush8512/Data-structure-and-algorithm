// // public class implementMinStackO2NandONSpaceComplexity {
    
// // }

// import java.util.*;

// class MinStack {
//     private Stack<int[]> st;

//     public MinStack() {
//         st = new Stack<>();
//     }

//     public void push(int value) {
//         if (st.isEmpty()) {
//             st.push(new int[]{value, value});
//             return;
//         }
//         int mini = Math.min(getMin(), value);
//         st.push(new int[]{value, mini});
//     }

//     public void pop() {
//         st.pop();
//     }

//     public int top() {
//         return st.peek()[0];
//     }

//     // Method to get the minimum in stack
//     public int getMin() {
//         return st.peek()[1];
//     }
// }

// public class implementMinStackO2NandONSpaceComplexity {
//     public static void main(String[] args) {
//         MinStack s = new MinStack();
//         s.push(-2);
//         s.push(0);
//         s.push(-3);
//         System.out.print(s.getMin() + " ");
//         s.pop();
//         System.out.print(s.top() + " ");
//         s.pop();
//         System.out.print(s.getMin());
//     }
// }

// //tc: O(1) for all operations
// //sc: O(n) for stack space, where n is the number of elements in the


// //optimal approach


import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private int mini;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (st.isEmpty()) {
            mini = value;
            st.push(value);
            return;
        }
        if (value > mini) {
            st.push(value);
        } else {
            st.push(2 * value - mini);
            mini = value;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;
        int x = st.pop();
        if (x < mini) {
            mini = 2 * mini - x;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;
        int x = st.peek();
        if (mini < x) return x;
        return mini;
    }
    public int getMin() {
        return mini;
    }
}

public class implementMinStackO2NandONSpaceComplexity {
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.print(s.getMin() + " ");
        s.pop();
        System.out.print(s.top() + " ");
        s.pop();
        System.out.print(s.getMin());
    }
}

//tc: O(1) for all operations
//sc: O(n) for stack space, where n is the number of elements in the stack