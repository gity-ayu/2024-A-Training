// DOUBLY LINKED LIST (ALL OPERATIONS)


#include <bits/stdc++.h>
using namespace std;

class Node
{
public:
	int data;
	Node *next;
	Node *prev;

	// CONSTRUCTOR
	Node(int data) {
		this->data = data;
		this->next = NULL;
		this->prev = NULL;
	}

	// DESTRUCTOR
	~Node()
	{
		int value = this->data;
		if (this->next != NULL || this->prev != NULL) {
			delete next;
			delete prev;
			this->next = NULL;
			this->prev = NULL;
		}
		cout << "Node with value '" << value << "' is deleted" << endl;;
	}
};

// function to insert at head
void insertAtHead(Node* &head, int d) {
	if (head == NULL) {
		Node* temp = new Node(d);
		head = temp;
		return;
	}
	Node* temp = new Node(d);
	temp->next = head;
	head->prev = temp;
	head = temp;
}

// FUNCTION TO INSERT AT END
void insertAtEnd(Node* &head, int d) {
	if (head == NULL) {
		Node* temp = new Node(d);
		head = temp;
		return;
	}

	Node* ptr = head;
	while (ptr->next != NULL) {
		ptr = ptr->next;
	}

	Node* temp = new Node(d);
	ptr->next = temp;
	temp->prev = ptr;
}

// FUNCTION TO IMSERT AT A POSITION
void insertAtPosition(Node* &head, int d, int pos)
{
	if (head == NULL) {
		Node* temp = new Node(d);
		head = temp;
		return;
	}
	
	if (pos == 1) {
		// insert at head
		Node* temp = new Node(d);
		temp->next = head;
		temp->prev = NULL;
		head = temp;
		return;
	}

	int c = 1;
	Node* ptr = head;
	while (c < pos - 1) {
		ptr = ptr->next;
		c++;
	}

	// If the position is at end
	if (ptr->next == NULL) {
		Node* temp = new Node(d);
		ptr->next = temp;
		temp->prev = ptr;
		return;
	}
	// in middle of ll
	Node* temp = new Node(d);
	temp->next = ptr->next;
	ptr->next->prev = temp;
	ptr->next = temp;
	temp->prev = ptr;

}


// DELETING NODE AT A POSITION
void deleteAtPosition(Node* &head, int pos)
{
	if (pos == 1)
	{
		Node* temp = head;
		head->next->prev = NULL;
		head = head->next;

		// deleting the memory
		temp->next = NULL;
		temp->prev = NULL;
		delete temp;
		return;
	}

	int c = 1;
	Node* temp = head;
	while (c < pos) {
		temp = temp->next;
		c++;
	}
	if (temp->next == NULL)
	{
		temp->prev->next = NULL;
		temp->next = NULL;
		temp->prev = NULL;
		delete temp;
		return;
	}

	temp->prev->next = temp->next;
	temp->next->prev = temp->prev;

	//freeing the memory
	temp->next = NULL;
	temp->prev = NULL;
	delete temp;


}


// Traversing the Linked List and Printing Nodes
void printList(Node* &head) {
	Node* temp = head;
	while (temp != NULL) {
		cout << temp->data << " -> ";
		temp = temp->next;
	}
	cout << "NULL";
}

// MAIN FUNCTION
int main()
{
#ifndef ONLINE_JUDGE
	// for getting input from input.txt
	freopen("input.txt", "r", stdin);
	// for writing output to output.txt
	freopen("output1.txt", "w", stdout);
#endif


	// Node* node1 = new Node(10);
	Node* head = NULL;

	insertAtHead(head, 12);
	insertAtEnd(head, 13);
	insertAtEnd(head, 14);

	insertAtPosition(head, 100, 1);
	cout << "BEFORE DELETION" << endl;
	printList(head);
	cout << endl;

	deleteAtPosition(head, 1);
	printList(head);




	return 0;
}