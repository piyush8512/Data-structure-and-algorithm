// public class implementQueueUsingArray {
    
// }
class ArrayQueue {
    int[] arr;
    int start, end;
    int currSize, maxSize;

    public ArrayQueue() {
        arr = new int[10];
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 10;
    }

    public void push(int x) {
        if (currSize == maxSize) {
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } 
        else {
            end = (end + 1) % maxSize;
        }
        arr[end] = x;
        currSize++;
    }

    public int pop() {
        if (start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } 
        else {
            start = (start + 1) % maxSize;
        }

        currSize--;
        return popped;
    }


    public int peek() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }
    
    public boolean isEmpty() {
        return (currSize == 0);
    }
}

public class implementQueueUsingArray {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        String[] commands = {"ArrayQueue", "push", "push", 
                             "peek", "pop", "isEmpty"};
        int[][] inputs = {{}, {5}, {10}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    queue.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(queue.pop() + " ");
                    break;
                case "peek":
                    System.out.print(queue.peek() + " ");
                    break;
                case "isEmpty":
                    System.out.print(queue.isEmpty() ? "true " : "false ");
                    break;
                case "ArrayQueue":
                    System.out.print("null ");
                    break;
            }
        }
    }
}