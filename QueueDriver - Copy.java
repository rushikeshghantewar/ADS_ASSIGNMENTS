
import java.util.Scanner;

class Queue
{
     int front , rear,capacity,size;
     int que[];
    Queue(int capacity)
    {
        this.capacity=capacity;
        size=0;
        front=rear=0;        
        que=new int[this.capacity];
    }
    boolean isFull(Queue q)
    {
         return (q.size==q.capacity);
    }
    boolean isEmpty(Queue q)
    {
        return (q.size==0);
    }
    void nQueue(int x)
    {
        if(capacity==rear)
            System.out.println("Queue is Full");
        else
        {
            que[rear]=x;
            rear++;
            size++;
        }
    }
    void dQueue()
    {
        if(front==rear)
        {
            System.out.println("Queue is Empty");
        }
        else
         {
            for(int i=0;i<size;i++)
            {
                que[i]=que[i+1];
            }
             size--;
            if(rear<size)
            que[rear]=0;
            rear--;
           
         }
    }
    int  front()
    {
        if(front==-1)
        {
            System.out.println("Queue is Underflow");
               return 0;
        }
        else
        {
            int x=que[front];
           return x;
        }
     }
     void display()
    {
        for(int i=0;i<size;i++)
            System.out.print(que[i]+" ");
    }
    
        
}
class QueueDriver
{
    public static void main(String args[])
    {
        Queue st=new Queue(20);
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Choice : ");
         String choice[]={ "1.Enqueue","2.Dequeue","3.Front","4.DISPLAY","5.END"};
         int c;
         do
         {
              for (String s:choice)
              System.out.println(s);
              c =sc.nextInt();
              int x;
              switch(c)
              {
                  case 1:
                      System.out.println("Enter element to push into queue");
                      x=sc.nextInt();
                      st.nQueue(x);
                      break;
                  case 2:
                      st.dQueue();
                      break;
                  case 3:
                      x=st.front();
                      System.out.println("front of Queue : "+x);
                      break;
                  case 4:
                      st.display();
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=5);
        
    }
        
    }
