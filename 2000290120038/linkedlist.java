class LL{
    Node head;
    static int size;
    LL()
    {
        size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data)
    {
        Node new_node = new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void addLast(int data)
    {
        Node new_node = new Node(data);
        if(head == null)
        {
            head=new_node;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp=temp.next;
        }
        temp.next = new_node;
    }
    public void printList()
    {
        if(head == null)
        {
            System.out.print("\nList is empty\n");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null\n");
    }
    public void removeFirst()
    {
        if(head == null)
        {
            System.out.print("\nList is already empty\n");
            return;
        }
        head=this.head.next;
        size--;
    }
    public void removeLast()
    {
        if(head == null)
        {
            System.out.print("\nList is already empty\n");
            return;
        }
        if(head.next==null)
        {
            head=null;
            size--;
            return;
        }
        Node temp = head;
        while(temp.next.next != null)
        {
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    public void addPosition(int pos, int data)
    {
        if((size+1)<pos || pos<0)
        {
            System.out.print("\nInvalid Position");
            return;
        }
        Node new_node = new Node(data);
        if(head == null || pos == 1)
        {
            new_node.next=head;
            head=new_node;
            return;
        }
        Node temp = head;
        for( int i=1;i<=size;i++)
        {
            if(i==pos-1)
            {
               new_node.next=temp.next;
               temp.next=new_node;
               break;
               
            }
            temp=temp.next;
        }
        return;
        
    }
    public static void main(String[] args)
    {
        LL link = new LL();
        link.addFirst(1);
        link.addLast(2); 
        link.addPosition(2,10);
        link.addPosition(3,5);
        link.printList();
        System.out.println("\nSize of list is : "+size+"\n");
        link.removeLast();
        link.printList();
        System.out.println("\nSize of list is : "+size);
        
    }
}