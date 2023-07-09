class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

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

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfterNode(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node does not exist.");
            return;
        }

        Node newNode = new Node(data);

        newNode.prev = prevNode;
        newNode.next = prevNode.next;

        if (prevNode.next != null) {
            prevNode.next.prev = newNode;
        } else {
            tail = newNode;
        }

        prevNode.next = newNode;
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

public class InsertionDoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(4);

        System.out.println("Initial Doubly Linked List:");
        list.display();

        list.insertAtBeginning(0);
        System.out.println("After inserting a node at the beginning:");
        list.display();

        list.insertAtEnd(5);
        System.out.println("After inserting a node at the end:");
        list.display();

        Node prevNode = list.head.next;
        list.insertAfterNode(prevNode, 3);
        System.out.println("After inserting a node after a specific node:");
        list.display();
    }
}
