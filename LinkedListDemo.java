package DSArraypack;

public class LinkedListDemo {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void PrintList()
        {
            Node n=head;
            while(n!=null)
            {
                System.out.println(n.data+"");
                n=n.next;
            }
        }
public static void main(String []args)
{
    LinkedListDemo lst=new LinkedListDemo();
    lst.head=new Node(10);
    Node first=new Node(20);
    Node second=new Node(30);
    lst.head.next=first;
    first.next=second;

    lst.PrintList();
}


//
//        public void insertNode(int data)
//        {
//            LinkedListDemo ln=new LinkedListDemo();
//            Node n=new Node(data);
//            n.next=null;
//
//        }


    }



