public class MyClass {
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
 static void insertion(Node node,Node head){
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=node;
    node.next=null;
    System.out.println("Node has been Inserted");
} 
static void deletion(Node node,Node head){
    Node temp=head;
     while(temp.next!=null && temp.next.data!=node.data ){
        temp=temp.next;
    }
    if(temp.next!=null && temp.next.next!=null)
    temp.next=temp.next.next;
    else temp.next=null;
    System.out.println("Node Deleted Succcesfully");
}
    public static void main(String args[]) {
      Node head=new Node(12);
     Node node=new Node(24);
     insertion(node,head);
     Node buff=head;
      while(buff!=null){
          System.out.println(buff.data);
          buff=buff.next;
      }
       deletion(node,head);
        buff=head;
      while(buff!=null){
          System.out.println(buff.data);
          buff=buff.next;
      }
    }
}