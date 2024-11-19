public class StackArray {
    private int arr[];
    private int size;
    private int index = 0;

    public StackArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr[--index];

    }
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(12);
        stack.push(25);
        stack.push(30);
        stack.push(78);
        stack.push(16);

        System.out.println("1. Size of stack after operation: "+stack.size);

        System.out.println("2. Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.print(" "+ stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operation: "+stack.size());

    }
}