
import java.util.Scanner;

class DoublyLL
{
    class Node
    {
        int data;
        Node fLink,bLink;
        Node(int data)
        {
            this.data=data;
            fLink=bLink=null;
        }
    }
    private Node start;
    private int length;
    DoublyLL()
    {
        this.start=null;
        this.length=0;
    }
    void displayF()
    {
       Node n=start;
       while(n!=null)
         {
             System.out.print(n.data+"--> ");
             n=n.fLink;
         }
    }
      void displayB()
    {
        Node n=start;
       while(n.fLink!=null)
         {
             n=n.fLink;
         }
        while(n.bLink!=null)
         {
             System.out.print("<-- "+n.data);
             n=n.bLink;
         }
        System.out.print("<-- "+n.data);
    }
    void inBeg(int x)
    {
        Node newN=new Node(x);
        if(start==null)
        {
            start=newN;
        }
        else
        {
            start.bLink=newN;
            newN.fLink=start;
            start=newN;
        }
        length++;
    }
    void inEnd(int x)
    {
        Node newN=new Node(x);
        if(start==null)
        {
            start=newN;
        }
        else
        {
            Node n=start;
            while(n.fLink!=null)
            {
                n=n.fLink;
            }
            n.fLink=newN;
            newN.bLink=n;
        }
         length++;
    }
    void inMiddle(int x,int pos)
    {
        Node newN=new Node(x);
        Node n=start;
        if(start==null)
        {
            start=newN;
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
                n=n.fLink;
            }
            n.fLink.bLink=newN;
            newN.fLink=n.fLink;
            newN.bLink=n;
            n.fLink=newN;
        }
         length++;
    }
     void delBeg()
    {
        if(start==null)
        System.out.println("LinkedList is Empty");
        else
        {
            start=start.fLink;
            start.bLink=null;
             length--;
        }
    }
    void delEnd()
    {
        if(start==null)
        {
             System.out.println("LinkedList is Empty");
        }
        else
        {
            Node n=start;
            while(n.fLink!=null)
            {
                n=n.fLink;
            }
            n.bLink.fLink=null;
            n.bLink=null;
            length--;
        }
     
    }
    void delMiddle(int pos)
    {
        Node n=start;
        if(start==null)
        {
              System.out.println("LinkedList is Empty");
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
                n=n.fLink;
            }
            n.fLink=n.fLink.fLink;
            n.fLink.fLink.bLink=n;
             length--;
        }
       
    }
}
class DoublyLLDriver
{
    public static void main(String args[])
    {
        DoublyLL dl=new DoublyLL();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Your Choice : ");
         String choice[]={ "1.Insert BEG","2.Insert END","3.Insert MIDDLE","4.Delete Middle","5.Delete BEG","6.Delete END","7.Display  Forward","8.Display Backward","9.END"};
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
                      dl.inBeg(x);
                      break;
                  case 2:
                      System.out.println("Add element to end");
                      x=sc.nextInt();
                    dl.inEnd(x);
                      break;
                  case 3:
                       System.out.println("Enter position");
                       y=sc.nextInt();
                        System.out.println("Add element to Middle");
                        x=sc.nextInt();
                      dl.inMiddle(x, y);
                      break;
                  case 4:
                      System.out.println("Enter position");
                       y=sc.nextInt();
                   dl.delMiddle(y);
                      break;
                  case  5:
                    dl.delBeg();
                      break;
                  case 6:
                     dl.delEnd();
                      break;
                  case 7:
                     dl.displayF();
                      System.out.println("");
                      break;
                  case 8:
                     dl.displayB();
                      System.out.println("");
                      break;
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=9);
    }
}
        