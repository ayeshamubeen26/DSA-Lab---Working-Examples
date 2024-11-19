import java.security.PublicKey;

class StackLinkedList {
    private Node top;

    class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
        }
    }
        public void InsertFirst(int data) {
            Node n = new Node(data);
            n.next = top;
            top = n;
        }

        public Node DeleteFirst() {
            Node temp = top;
            top = top.next;
            return temp;
        }

        public void DisplayList() {
            Node current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    class LinkedList {
        StackLinkedList li = new StackLinkedList();

        public void push(int element) {
            li.InsertFirst(element);
        }

        public void pop() {
            li.DeleteFirst();
        }

        public void DisplayStack() {
            System.out.println(" ");
            li.DisplayList();
        }

        public static void main(String[] args) {
            LinkedList LL =new LinkedList();

            LL.push(52);
            LL.push(60);
            LL.push(22);
            LL.push(12);
            LL.push(62);
            LL.push(82);

            System.out.print("1. Stack after push operation: ");
            LL.DisplayStack();
            System.out.print("\n2. Stack after pop operation: ");
            LL.pop();
            LL.DisplayStack();

        }
    }

