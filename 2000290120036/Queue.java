public class Queue {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head=null;
    public void printQueue(){
        System.out.println("Printing Your Queue....");
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void add(int data){
        if(head==null){
            Node temp=new Node(data);
            head=temp;
            System.out.println("Item added :->" +data);
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node buff=new Node(data);
            temp.next=buff;
            System.out.println("Item added :->" +data);
            
        }
    }
    public void remove(){
        if(head==null) {
            System.out.println("Can Not remove from Empty Queue");
            return;
        }
        Node temp=head;
        System.out.println("Item Deleted:-> "+head.data);
       if(temp.next!=null) {
           head=head.next;
           temp=null;
       }
    else{
        head=null;
    }
    }
    public static void main(String args[]) {
     Queue q=new Queue();
    // q.add(9);
     q.printQueue();
     q.remove();
     q.printQueue();
    }
}