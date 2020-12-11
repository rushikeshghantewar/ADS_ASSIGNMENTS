
import java.util.Scanner;

class LinkedList
{
    Node head;
    Node tail;
     static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
     public void printList()
     {
         Node n=head;
         while(n!=null)
         {
             System.out.print(n.data+" ");
             n=n.next;
         }
         
     }
     public void inBegining(int d)
     {
         Node newN=new Node(d);
         if(head==null)
         {
             head=newN;
             tail=newN;
         }
         else
         {
            newN.next=head;
            head=newN;
         }
     }
     public void inEnd(int d)
     {
         Node newN=new Node(d);
         if(head==null)
         {
             head=newN;
             tail=newN;
         }
         else
         {
             tail.next=newN;
             tail=newN;
         }
         
     }
      public void inMiddle(int pos,int d)
     {
         Node newN=new Node(d);
         Node temp=head;
         for(int i=1;i<pos-1;i++)
         {
             temp=temp.next;
         }
         newN.next=temp.next;
         temp.next=newN;
     }
     void delBeg()
     {
         if(head==null)
         System.out.println("LinkedList is Empty");
         else
         {
             int x;
             x=head.data;
             head=head.next;
          System.out.println(x+" Element Deleted Succesfully");
         }
     }
     void delEnd()
     {
         Node n=head;
         if(head==null)
           System.out.println("LinkedList is Empty");
         else
         {
             if(n.next==tail)
             {
                 n.next=null;
                 n=tail;
             }
             else
                 n=n.next;
            System.out.println(n.data+" Element Deleted Succesfully");
         }
     }
     void delMiddle(int pos)
     {
         Node temp=head;
         if(head==null)
           System.out.println("LinkedList is Empty");
         else
         {
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
                temp.next=temp.next.next;
         }
     }
}
 class LinkedListDriver
{
     public static void main(String args[])
    {
        LinkedList l1=new LinkedList();
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
                      l1.inBegining(x);
                      break;
                  case 2:
                      System.out.println("Add element to end");
                      x=sc.nextInt();
                      l1.inEnd(x);
                      break;
                  case 3:
                       System.out.println("Enter position");
                       y=sc.nextInt();
                        System.out.println("Add element to Middle");
                        x=sc.nextInt();
                        l1.inMiddle(y,x);
                      break;
                  case 4:
                      System.out.println("Enter position");
                       y=sc.nextInt();
                      l1.delMiddle(y);
                      break;
                  case  5:
                      l1.delBeg();
                      break;
                  case 6:
                      l1.delEnd();
                      break;
                  case 7:
                      l1.printList();
                      System.out.println("");
                      break;
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=8);
         
       
    }
}