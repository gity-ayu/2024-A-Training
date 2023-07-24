class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("The given previous node does not exist.");
            return;
        }

        Node nodeToDelete = prevNode.next;
        prevNode.next = nodeToDelete.next;
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

public class Deletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Initial Linked List:");
        list.display();


        list.deleteAtBeginning();
        System.out.println("After deleting a node at the beginning:");
        list.display();


        list.deleteAtEnd();
        System.out.println("After deleting a node at the end:");
        list.display();

        Node prevNode = list.head;
        list.deleteAfterNode(prevNode);
        System.out.println("After deleting a node after a specific node:");
        list.display();
    }
}
