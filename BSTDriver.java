import java.util.*;
class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
         public int getData()
         {
             return data;
         }   
       public void setRight(Node n)
        {
            right = n;
        }
       public void setLeft(Node n)
        {
            left = n;
        }
       public Node getLeft()
        {
            return left;
        }
         public Node getRight()
        {
            return right;
        }
    }
class BST
{
    Node root;
    
    BST()
    {
        root=null;
    }
    public Node createNewNode(int data)
    {
        Node n=new Node(data);
        n.data=data;
        n.left=null;
        n.right=null;
        return n;
    }
    
    public void insert(int data)
    {
        root=insert(root,data);
    }
    public  Node insert(Node node,int data)
    {
        if(node==null)
        {
          node=new Node(data);
        }
        else
        {
            if (data <= node.getData())
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
        }
        return node;
    }
 
    void printPostOrder(Node node)
    {
        if(node==null)
            return;
        else
        {
            printPostOrder(node.getLeft());
            printPostOrder(node.getRight());
            System.out.print(node.getData()+" ");
        }
    }
    void printInOrder(Node node)
    {
        if(node==null)
            return;
        else
        {
            printInOrder(node.getLeft());
            System.out.print(node.getData()+" ");
            printInOrder(node.getRight());
        }
    }
    void printPreOrder(Node node)
    { 
        if(node==null)
            return;
        else
        {
            System.out.print(node.getData()+" ");
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }
    public void printPostOrder()
    {
        printPostOrder(root);
    }
     public void printPreOrder()
    {
        printPreOrder(root);
    }
      public void printInOrder()
    {
        printInOrder(root);
    }
}
class BSTDriver
{
    public static void main(String args[])
    {
           BST b=new BST();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Your Choice : ");
         String choice[]={ "1.Insert BEG","2.Inorder","3.PreOrder","4.PostOrder","9.END"};
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
                      System.out.println("Add node");
                      x=sc.nextInt();
                      b.insert(x);
                      break;
                  case 2:
                      b.printInOrder();
                      break;
                 case 3:
                      b.printPreOrder();
                      break;
                case 4:
                      b.printPostOrder();
                      break;
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=9);
       
    }
}