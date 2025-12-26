class LinkedList {
    // Node class representing each element in the list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // First node of the list

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point to the old head
        head = newNode; // New node becomes the head
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode; // If list is empty, new node is the head
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next; // Traverse to the last node
        }
        temp.next = newNode; // Link last node to new node
    }

    // Display the list
    public void display() {
        if (isEmpty()) {
            System.out.println("Linked list is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked list: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Is list empty? " + list.isEmpty());
        list.insertAtEnd(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtBeginning(2);

        list.display();

        System.out.println("Is list empty? " + list.isEmpty());
    }
}
