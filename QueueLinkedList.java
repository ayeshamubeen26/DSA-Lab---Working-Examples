class QueueList {
    private Node front;
    private Node rear;

    static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return (front == null);
    }

    public void insertLast(int new_data){
        Node node = new Node(new_data);
        if (isEmpty()){
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }
    public int deleteFirst(){
        int temp = front.data;
        if (front.next == null){
            rear = null;
        }
        front = front.next;
        return temp;
    }
    public void DisplayList(){
        System.out.println("==Displaying elements of DEQ==");
        Node current = front;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
class Queue2{
    QueueList QL;

    public Queue2(){
        QL = new QueueList();
    }
    public boolean isEmpty(){
        return QL.isEmpty();
    }
    public void enqueue(int new_data){
        QL.insertLast(new_data);
    }
    public int deque(){
        return QL.deleteFirst();
    }
    public void printQueue(){
        QL.DisplayList();
    }
}
public class QueueLinkedList {
    public static void main(String[] args) {
        Queue2 List = new Queue2();

        List.enqueue(10);
        List.enqueue(20);
        List.enqueue(30);
        List.enqueue(40);

        List.printQueue();
        List.deque();
        List.printQueue();
    }
}
