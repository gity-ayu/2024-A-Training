class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def is_empty(self):
        return self.head is None

    def insert_at_head(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_at_tail(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def insert_at_position(self, data, position):
        if position < 0:
            print("Invalid position.")
            return

        if position == 0:
            self.insert_at_head(data)
            return

        new_node = Node(data)
        current = self.head
        prev = None
        count = 0

        while current and count < position:
            prev = current
            current = current.next
            count += 1

        if count == position:
            prev.next = new_node
            new_node.next = current
        else:
            print("Position is out of range.")

    def display(self):
        if self.is_empty():
            print("Linked list is empty.")
        else:
            current = self.head
            while current:
                print(current.data, end=" ")
                current = current.next
            print()


my_list = LinkedList()

my_list.insert_at_head(10)
my_list.insert_at_head(20)
my_list.insert_at_head(30)


my_list.insert_at_tail(40)
my_list.insert_at_tail(50)


print("Original Linked List:")
my_list.display()


my_list.insert_at_position(15, 2)
my_list.insert_at_position(25, 0)
my_list.insert_at_position(60, 6)


print("Updated Linked List:")
my_list.display()
