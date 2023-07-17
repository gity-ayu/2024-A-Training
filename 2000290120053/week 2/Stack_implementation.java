import java.util.Scanner; 

class Stack{
    int top;
    int msize=10;
    int arr[];
    
    Stack(){
        top=-1;
        arr= new int[msize];
    }
    // Stack(int n)    //user define size
    // {
    //     top=-1;
    //     this.msize=n;
    //     arr= new int[this.msize];
    // }
    
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    
    void push(Scanner sc)
    {
        if(top == this.msize-1)  
        {  
            System.out.println("Overflow !!");  
        }  
        else{
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
        }
    }
    
    void pop()
    {
        if (top<0)
        {  
            System.out.println("stack stackm is empty");
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped"); 
        }  
    }
    
    void display ()  
    {  
        if (top<0)
        {  
            System.out.println("empty stack");
            return;
        }  
        System.out.println("Print stack elements ");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }  
}
public class Stack_implementation
{
	public static void main(String[] args) {
		int choice=0;  
        Scanner sc = new Scanner(System.in);  
        Stack s = new Stack();  
        System.out.println("Stack operations using array");  
        while(choice<=4)
        {
            System.out.println("\nChose one from the below options");  
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("Enter your choice");        
            choice = sc.nextInt();  
            
            switch(choice)  
            {  
                case 1:  
                {   
                    s.push(sc);  
                    break;  
                }  
                case 2:  
                {  
                    s.pop();  
                    break;  
                }  
                case 3:  
                {  
                    s.display();  
                    break;  
                }  
                case 4:   
                {  
                    System.out.println("Exit");  
                    System.exit(0);  
                    break;   
                }  
                default:  
                {  
                    System.out.println("Please Enter valid choice ");  
                }   
            };  
        }


	}
}
