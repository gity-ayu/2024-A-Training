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

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("The doubly linked list is empty.");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The doubly linked list is empty.");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("The given previous node does not exist.");
            return;
        }

        Node nodeToDelete = prevNode.next;
        prevNode.next = nodeToDelete.next;

        if (nodeToDelete.next != null) {
            nodeToDelete.next.prev = prevNode;
        } else {
            tail = prevNode;
        }
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

public class DeletionDoublyLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Initial Doubly Linked List:");
        list.display();

        list.deleteAtBeginning();
        System.out.println("After deleting a node at the beginning:");
        list.display();

        list.deleteAtEnd();
        System.out.println("After deleting a node at the end:");
        list.display();

        Node prevNode = list.head.next;
        list.deleteAfterNode(prevNode);
        System.out.println("After deleting a node after a specific node:");
        list.display();
    }
}
