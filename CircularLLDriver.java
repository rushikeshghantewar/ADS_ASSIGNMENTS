import java.util.*;
class CircularLL
{
     Node head;
     Node tail;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    void display()
    {
       Node n=head;
       do{  
                System.out.print(" "+ n.data);  
                n = n.next;  
            }while(n != head);  
    }
    void inBeg(int x)
    {
        Node newN=new Node(x);
        if(head==null)
        {
            head=newN;
            head.next=newN;
            tail=newN;
        }
        else
        {
          newN.next=head;
          tail.next=newN;
          head=newN;
        }
    }
    void inEnd(int x)
    {
        Node newN=new Node(x);
        if(head==null)
        {
           head=newN;
           head.next=newN;
           tail=newN;
        }
        else
        {
            tail.next=newN;
            newN.next=head;
            tail=newN;
        }
    }
    void inMiddle(int x,int pos)
    {
        Node newN=new Node(x);
        Node n=head;
        if(head==null)
        {
           head=newN;
           head.next=newN;
           tail=newN;
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
               n=head.next;
            }
           newN.next=n.next;
           n.next=newN;
        }
    }
     void delBeg()
    {
        if(head==null)
        System.out.println("LinkedList is Empty");
        else
        {
            head=head.next;
            tail.next=head;
        }
    }
    void delEnd()
    {
        if(head==null)
        {
             System.out.println("LinkedList is Empty");
        }
        else
        {
            Node n=head;
            while(n.next.next!=head)
            {
                n=n.next;
            }
            n.next=head;
            tail=n;
        }
     
    }
    void delMiddle(int pos)
    {
        Node n=head;
        if(head==null)
        {
              System.out.println("LinkedList is Empty");
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
                n=n.next;
            }
            n.next=n.next.next;
        }
       
    }
}

class CircularLLDriver
{
    public static void main(String args[])
    {
        CircularLL cl=new CircularLL();
         Scanner sc=new Scanner(System.in);
          System.out.println("Enter Your Choice : ");
         String choice[]={ "1.Insert BEG","2.Insert END","3.Insert MIDDLE","4.Delete Middle","5.Delete BEG","6.Delete END","7.Display","8.END"};
         int c;
         do
         {
              for (String s:choice)
              System.out.println(s);
              c =sc.nextInt();
              int x,y;
              switch(c)
              {
                  case 1:
                      System.out.println("Add element to begining");
                      x=sc.nextInt();
                      cl.inBeg(x);
                      break;
                  case 2:
                      System.out.println("Add element to end");
                      x=sc.nextInt();
                      cl.inEnd(x);
                      break;
                  case 3:
                       System.out.println("Enter position");
                       y=sc.nextInt();
                        System.out.println("Add element to Middle");
                        x=sc.nextInt();
                        cl.inMiddle(x,y);
                      break;
                  case 4:
                      System.out.println("Enter position");
                       y=sc.nextInt();
                      cl.delMiddle(y);
                      break;
                  case  5:
                      cl.delBeg();
                      break;
                  case 6:
                      cl.delEnd();
                      break;
                  case 7:
                      cl.display();
                      System.out.println("");
                      break;
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=8);
    }
}