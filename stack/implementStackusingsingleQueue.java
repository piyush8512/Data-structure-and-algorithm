// // public class implementStackusingsingleQueue {
    
// // }

// import java.util.*;

// // Stack implementation using Queue
// class QueueStack {
//     Queue<Integer> q = new LinkedList<>();

//     public void push(int x) {
//         int s = q.size();
//         q.add(x);
//         for (int i = 0; i < s; i++) {
//             q.add(q.poll());
//         }
//     }

//     public int pop() {
//         int n = q.peek();
//         q.poll();
//         return n;
//     }

//     public int top() {
//         return q.peek();
//     }


//     public boolean isEmpty() {
//         return q.isEmpty();
//     }
// }

// // Main class
// public class implementStackusingsingleQueue {
//     public static void main(String[] args) {
//         QueueStack st = new QueueStack();
//         String[] commands = {"QueueStack", "push", "push", 
//                              "pop", "top", "isEmpty"};
//         int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

//         for (int i = 0; i < commands.length; ++i) {
//             switch (commands[i]) {
//                 case "push":
//                     st.push(inputs[i][0]);
//                     System.out.print("null ");
//                     break;
//                 case "pop":
//                     System.out.print(st.pop() + " ");
//                     break;
//                 case "top":
//                     System.out.print(st.top() + " ");
//                     break;
//                 case "isEmpty":
//                     System.out.print(st.isEmpty() ? "true " : "false ");
//                     break;
//                 case "QueueStack":
//                     System.out.print("null ");
//                     break;
//             }
//         }
//     }
// }

// Time Complexity: O(n) for push, O(1) for pop, top, and isEmpty
// Space Complexity: O(n) where n is the number of elements in the stack