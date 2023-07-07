// SINGLY LINKED LIST (ALL PRIMITIVE OPERATIONS)

#include <bits/stdc++.h>
using namespace std;

class Node
{
public:
	int data;
	Node *next;

	// CONSTRUCTOR
	Node(int data) {
		this->data = data;
		this->next = NULL;
	}

	// DESTRUCTOR
	~Node()
	{
		int value = this->data;
		if (this->next != NULL) {
			delete next;
			this->next = NULL;
		}
		cout << "Node with value '" << value << "' is deleted" << endl;;
	}
};

// function to insert at head
void insertAtHead(Node* &head, int d)
{
	if (head == NULL) {
		Node* temp = new Node(d);
		head = temp;
		return;
	}
	// new node create
	Node* temp = new Node(d);
	temp->next = head;
	head = temp;
}

// FUNCTION TO INSERT AT END
void insertAtEnd(Node* &head, int d)
{
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
}

// FUNCTION TO InSERT AT A POSITION
void insertAtPosition(Node* &head, int d, int pos)
{
	if (head == NULL) {
		Node* temp = new Node(d);
		head = temp;
		return;
	}

	if (pos == 1) {
		insertAtHead(head, d);
		return;
	}

	pos--;
	Node* ptr = head;
	Node* prev = NULL;
	while (pos != 0) {
		prev = ptr;
		ptr = ptr->next;
		pos--;
	}
	Node* temp = new Node(d);
	prev->next = temp;
	temp->next = ptr;
}

// DELETING NODE AT A POSITION
void deleteAtPosition(Node* &head, int pos)
{
	if (pos == 1) {
		Node* temp = head;
		head = head->next;

		// freeing the memory
		temp->next = NULL;
		delete temp;
	}

	else {
		int c = 1;
		Node* curr = head;
		Node* prev = NULL;

		while (c < pos) {
			prev = curr;
			curr = curr->next;
			c++;
		}

		prev->next = curr->next;
		// deleting the memory
		curr->next = NULL;
		delete curr;
	}
}


// Traversing the Linked List and Printing Nodes
void printList(Node* &head)
{
	Node* temp = head;
	while (temp != NULL) {
		cout << temp->data << " -> ";
		temp = temp->next;
	}
	cout << "NULL";
}

int main()
{
#ifndef ONLINE_JUDGE
	// for getting input from input.txt
	freopen("input.txt", "r", stdin);
	// for writing output to output.txt
	freopen("output.txt", "w", stdout);
#endif


	//Node* node1 = new Node(10);
	Node* head = node1;

	insertAtHead(head, 12);
	insertAtEnd(head, 13);
	insertAtEnd(head, 14);
	insertAtPosition(head, 100, 5);
	cout << "BEFORE DELETION" << endl;
	printList(head);
	cout << endl;

	deleteAtPosition(head, 1);
	printList(head);




	return 0;
}