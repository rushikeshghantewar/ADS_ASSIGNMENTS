import java.util.*;
class DoublyCircularLL
{
         Node head;
         Node tail;
        class Node
        {
           int data;
           Node fLink,bLink;
            Node(int data)
            {
                this.data=data;
            }
        }
        void displayF()
       {
          Node n=head;
          do{  
                   System.out.print( n.data+"-->");  
                   n = n.fLink;  
               }while(n != head);  
       }
        void frstNode(int x)
        {
            Node newN=new Node(x);
                head=newN;
                tail=newN;
                head.fLink=newN;
                head.bLink=newN;
               
        }
        void inBeg(int x)
        {
            Node newN=new Node(x);
            if(head==null)
            {
               frstNode(x);
            }
            else
            {
                newN.fLink=head;
                head.bLink=newN;
                newN.bLink=tail;
                tail.fLink=newN;
                head=newN;
                
            }
        }
        void inEnd(int x)
        {
            Node newN=new Node(x);
            if(head==null)
            {
               frstNode(x);
            }
            else
            {
                tail.fLink=newN;
                newN.bLink=tail;
                tail=newN;
                tail.fLink=head;
                head.bLink=tail;
            }
        }
        void inMiddle(int x,int pos)
        {
            Node newN=new Node(x);
            if(head==null)
            {
               frstNode(x);
            }
            else
            {
                Node n=head;
                for(int i=1;i<pos-1;i++)
                {
                    n=n.fLink;
                }
                newN.fLink=n.fLink;
                n.fLink.bLink=newN;
                n.fLink=newN;
                newN.bLink=n;
            }
        }
        void delBeg()
        {
            if(head==null)
                System.out.println("List is empty");
            else
            {
                head=head.fLink;
                tail.fLink=head;
                head.bLink=tail;
            }
            
        }
         void delEnd()
        {
             if(head==null)
                System.out.println("List is empty");
            else
            {
                Node n=head;
               while(n.fLink.fLink!=head)
               {
                   n=n.fLink;
               }
               tail=n;
               tail.fLink=head;
               head.bLink=tail;
            }
        }
          void delMiddle(int pos)
        {
             if(head==null)
                System.out.println("List is empty");
            else
            {
                 Node n=head;
                for(int i=1;i<pos-1;i++)
                {
                    n=n.fLink;
                }
                n.fLink=n.fLink.fLink;
                n.fLink.fLink.bLink=n;
            }
        }
}
class DoublyCircularLLD
{
    public static void main(String args[])
    {
        DoublyCircularLL cl=new DoublyCircularLL();
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
                      cl.displayF();
                      System.out.println("");
                      break;
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=8);
    }
}