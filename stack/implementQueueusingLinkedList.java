// public class implementQueueusingLinkedList {
    
// }


class Node {
    int val;
    Node next;
    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedListQueue {
    private Node start;
    private Node end;
    private int size;

    public LinkedListQueue() {
        start = end = null;
        size = 0;
    }

    public void push(int x) {
        Node element = new Node(x);
            if (start == null) {
            start = end = element;
        } else {
            end.next = element;
            end = element;
        }
        size++;
    }

    public int pop() {
        if (start == null) {
            return -1;
        }
        int value = start.val;
        Node temp = start;
        start = start.next;
        temp = null;
        size--;
        return value;
    }

    public int peek() {
        if (start == null) {
            return -1;
        }
        return start.val;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}

public class implementQueueusingLinkedList {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        // Array of commands
        String[] commands = {"LinkedListQueue", "push", "push", 
                             "peek", "pop", "isEmpty"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(q.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListQueue")) {
                System.out.print("null ");
            }
        }
    }
}