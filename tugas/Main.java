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
