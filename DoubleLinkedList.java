
public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkedList {
    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Menambahkan node di awal linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Menambahkan node di akhir linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Membaca node selanjutnya
    public Node readNext(Node current) {
        return current != null ? current.next : null;
    }

    // Membaca node sebelumnya
    public Node readPrevious(Node current) {
        return current != null ? current.prev : null;
    }

    // Menampilkan elemen linked list dari depan ke belakang
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.insertAtEnd(10);
        dll.insertAtBeginning(5);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(2);

        System.out.println("Linked List from front to back:");
        dll.displayForward();

        Node currentNode = dll.readNext(dll.readNext(dll.readNext(dll.readNext(null))));
        System.out.println("Data in the next node: " + (currentNode != null ? currentNode.data : "No next node"));

        Node previousNode = dll.readPrevious(dll.readPrevious(dll.readPrevious(dll.readPrevious(null))));
        System.out.println("Data in the previous node: " + (previousNode != null ? previousNode.data : "No previous node"));
    }
}