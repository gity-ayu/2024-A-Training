class Queue{
    int front,rear,size;
    int capacity;
    int array[];
    public Queue(int capacity)
    {
        this.capacity=capacity;
        array=new int[this.capacity];
        this.size=0;
        this.front=0;
        this.rear=capacity-1;  ///alternative of -1;
    }
    
    boolean isFull(Queue queue)
    {
        return queue.size==queue.capacity;
    }
    boolean isEmpty(Queue queue)
    {
        return queue.size==0;
    }
    
    void enqueue(int item)
    {
        
        if(isFull(this))
        {
            System.out.println("Queue is full");
            return;
        }
        
        //if rear comes before front
        if(this.size>0 && (this.rear+1)%this.capacity==this.front) 
        {
            System.out.println("Queue is full");
            return;
        }
        
        this.rear=(this.rear+1)%this.capacity;
        this.size+=1;
        this.array[rear]=item;
        System.out.println(item + " is enqueued ");
    }
    
    int dequeue()
    {
        if(isEmpty(this))
        {
            //System.out.println("queue is empty");
            return -1;
        }
        if(this.front==this.rear)
        {
            //update the qeueue which will become empty
            this.size=0;
            this.front=0;
            this.rear=this.capacity-1;
            return array[front];
        }
        else{
            int item=this.array[this.front];
            this.front=(this.front+1)%this.capacity;
            this.size-=1;
            return item;
        }
        
    }
    
    int front()
    {
        if(isEmpty(this))
        {
            return -1;
        }
        
        return this.array[this.front];
    }
    
    int rear()
    {
        if(isEmpty(this))
        {
            return -1;
        }
        
        return this.array[this.rear];
    }
    
    int size(){
        return this.size;
    }
}

public class Queue_implementation
{
	public static void main(String[] args)
    {
        Queue queue = new Queue(10);
 
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
 
        System.out.println(queue.dequeue() + " dequeued from queue\n");
 
        System.out.println("Front item is " + queue.front());
 
        System.out.println("Rear item is " + queue.rear());
                           
        System.out.println("Rear item is " + queue.size());
    }
}
