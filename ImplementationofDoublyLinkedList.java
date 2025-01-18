public class ImplementationofDoublyLinkedList {
    Node Head, tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;

        }
    }

    public void Display(Node Head){
        Node temp = Head;
        while (temp != null){
            System.out.println(temp.data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }

}
