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

    def delete_at_head(self):
        if self.is_empty():
            print("Linked list is empty. Nothing to delete.")
            return
        self.head = self.head.next

    def delete_by_value(self, data):
        if self.is_empty():
            print("Linked list is empty. Nothing to delete.")
            return

        if self.head.data == data:
            self.head = self.head.next
            return

        current = self.head
        prev = None

        while current:
            if current.data == data:
                prev.next = current.next
                return
            prev = current
            current = current.next

        print("Value not found in the linked list.")

    def delete_at_position(self, position):
        if self.is_empty():
            print("Linked list is empty. Nothing to delete.")
            return

        if position == 0:
            self.head = self.head.next
            return

        current = self.head
        prev = None
        count = 0

        while current:
            if count == position:
                prev.next = current.next
                return
            prev = current
            current = current.next
            count += 1

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


my_list.delete_at_head()


my_list.delete_by_value(40)


my_list.delete_at_position(1)


print("Updated Linked List:")
my_list.display()
