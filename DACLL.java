/*import java.io;
class DACLL
{
     static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    Node head;
    public DACLL()
    {
        head=null;
    }
    public void add_to_front(int x)
    {
        Node n=new Node(x);
       // n.set_next(head);
        head=n;
    }
    public void print_list()
    {
        for(Node ptr=head; ptr!=null;ptr=ptr.get_next())
        {
            System.out.println(" "+ptr.get_value());
        }
    }
    public static void  main(String args[])
    {
        DACLL d=new DACLL();
        d.add_to_front(5);
        d.add_to_front(1);
        d.add_to_front(3);
        d.add_to_front(2);
    }
}*/