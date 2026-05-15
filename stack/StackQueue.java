import java.util.*;

 class StackQueue {
    private Stack<Integer> st1, st2;

    public StackQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public int pop() {
        if (st1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        int topElement = st1.pop(); 

        return topElement; 
    }

    public int peek() {
        if (st1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return st1.peek();
    }

    public boolean isEmpty() {
        return st1.isEmpty();
    }
}

public class stackQueue {
    public static void main(String[] args) {
        StackQueue q = new StackQueue();

        String[] commands = {"StackQueue", "push", "push", 
                             "pop", "peek", "isEmpty"};
        int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(q.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("StackQueue")) {
                System.out.print("null ");
            }
        }
    }
}