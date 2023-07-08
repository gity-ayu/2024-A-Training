public class Stack {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head=null;
    public void printStack(){
        System.out.println("Printing Your Stack....");
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void push(int data){
        if(head==null){
            Node temp=new Node(data);
            head=temp;
            System.out.println("Item Pushed :->" +data);
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node buff=new Node(data);
            temp.next=buff;
            System.out.println("Item Pushed :->" +data);
            
        }
    }
    public void pop(){
        if(head==null) {
            System.out.println("Can Not POP Empty Stack");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Item Popped :->" +head.data);
            head=null;
        } 
        else{
        System.out.println("Item Popped :->" +temp.next.data);
        temp.next=null;
        
        }
        
    }
    public static void main(String args[]) {
      Stack s=new Stack();
     s.push(10);
      s.printStack();
      s.pop();
      s.printStack();
    }
}