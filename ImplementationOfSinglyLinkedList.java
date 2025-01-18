public class ImplementationOfSinglyLinkedList {
    Node Head, Tail;
    int size;

    public ImplementationOfSinglyLinkedList() {
        Head = Tail = null;
        size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void AddAtEnd(int data) {
        Node n = new Node(data);
        if (Head == null) {
            Head = Tail = n;
        } else {
            Tail.next = n;
            Tail = n;
        }
        size++;
    }

    public void AddAtBeginning(int data) {
        Node n = new Node(data);
        if (Head == null) {
            Head = Tail = n;
        } else {
            n.next = Head;
            Head = n;
        }
        size++;
    }

    public void InsertAt(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        Node t = new Node(data);
        if (idx == 0) {
            t.next = Head;
            Head = t;
            if (Tail == null) Tail = t;
        } else {
            Node n = Head;
            for (int i = 0; i < idx - 1; i++) {
                n = n.next;
            }
            t.next = n.next;
            n.next = t;
            if (t.next == null) Tail = t;
        }
        size++;
    }

    public void RemoveFirst() {
        if (Head == null) {
            System.out.println("The List Is Empty");
            return;
        }
        System.out.println("Removed: " + Head.data);
        if (Head == Tail) {
            Head = Tail = null;
        } else {
            Head = Head.next;
        }
        size--;
    }

    public int GetAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return -1;
        }

        Node n = Head;
        for (int i = 0; i < idx; i++) {
            n = n.next;
        }
        return n.data;
    }

    public void DeleteAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return;
        }
        if (idx == 0) {
            Head = Head.next;
            size--;
            return;
        }
        Node n = Head;
        for (int i = 0; i < idx - 1; i++) {
            n = n.next;
        }
        System.out.println("Deleted: " + n.next.data);
        n.next = n.next.next;
        if (idx == size - 1) Tail = n;
        size--;
    }

    public Node DeleteNthFromEnd(int n) {
        if (Head == null) {
            return null;
        }

        Node slow = Head, fast = Head;
        for (int i = 1; i <= n; i++) {
            if (fast == null) {
                // If n is greater than the number of nodes, return the original list
                return Head;
            }
            fast = fast.next;
        }
        // If 'fast' is null, we are deleting the head node
        if (fast == null) {
            Head = Head.next; // Move head to the next node
            return Head;
        }

        // Move both pointers until 'fast' reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete the nth node from the end
        slow.next = slow.next.next;

        return Head;
    }

    public void MiddleNode() {
        if (Head == null) return;
        Node fast = Head, slow = Head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle node: " + slow.data);
    }

    public void printList() {
        if (Head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = Head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean IsCircle() {
        if (Head == null && Head.next == null) return false;
        Node fast = Head, slow = Head;
        while (fast != null) {
            if (slow == null) return false;
            slow = slow.next;
            if (fast.next == null) return false;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;

    }

    public Node Cycle() {
        if (Head == null || Head.next == null) {
            System.out.println("No Nodes or insufficient nodes to form a cycle.");
            return null; // No cycle possible
        }

        Node slow = Head, fast = Head;

        // Detect cycle using the Tortoise and Hare approach
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, a cycle is detected
            if (slow == fast) {
                break;
            }
        }

        // Check if no cycle is detected
        if (fast == null || fast.next == null) {
            System.out.println("\nNo cycle found.");
            return null;
        }

        // Find the start of the cycle
        Node temp = Head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return slow; // The starting node of the cycle
    }

    public Node MergeTwoList(Node List1, Node List2) {
        Node temp1 = List1;
        Node temp2 = List2;
        Node Head = new Node(100);
        Node temp = Head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;

            }
        }
        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp2;
        }
        return Head.next;
    }

    public static void main(String[] args) {
        ImplementationOfSinglyLinkedList SL = new ImplementationOfSinglyLinkedList();

        SL.AddAtEnd(25);
        SL.AddAtEnd(55);
        SL.AddAtEnd(14);
        SL.AddAtEnd(46);
        SL.AddAtEnd(78);
        System.out.println("Add At End: ");
        SL.printList();

        System.out.println("\nAdd At Beginning: ");
        SL.AddAtBeginning(100);
        SL.printList();

        System.out.println("\nAdd At: ");
        SL.InsertAt(0, 36);
        SL.printList();

        System.out.println("\nGet At: " + SL.GetAt(2));

        System.out.println("\nDelete At:");
        SL.DeleteAt(1);
        SL.printList();

        System.out.println("\nSize of the SL is: " +SL.size);
        System.out.println();

        SL.MiddleNode();


        System.out.println("\nDelete nth Node From End: ");
        SL.DeleteNthFromEnd(6);
        SL.printList();

        System.out.println("\nIs circle True OR False? "+SL.IsCircle());
        System.out.println("\nCycle: "+SL.Cycle());

        //MERGE TWO SORTED LISTS
        ImplementationOfSinglyLinkedList list1 = new ImplementationOfSinglyLinkedList();
        list1.AddAtEnd(1);
        list1.AddAtEnd(3);
        list1.AddAtEnd(4);

        // Create the second linked list
        ImplementationOfSinglyLinkedList list2 = new ImplementationOfSinglyLinkedList();
        list2.AddAtEnd(2);
        list2.AddAtEnd(5);
        list2.AddAtEnd(6);

    }
}
