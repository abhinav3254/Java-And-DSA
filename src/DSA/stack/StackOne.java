package DSA.stack;

public class StackOne {
    private int[] arr;
    private final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public StackOne(int size) {
        this.arr = new int[size];
    }

    public StackOne() {
        arr = new int[DEFAULT_SIZE];
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack Overflow");
        } else {
            ptr = ptr+1;
            arr[ptr] = data;
        }
    }

    private boolean isFull() {
        return ptr == arr.length-1;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(arr[ptr--]);
        }
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek through Empty Stack");
        } else {
            System.out.println(arr[ptr]);
        }
    }
}
