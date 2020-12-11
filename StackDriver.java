import java.util.*;
class Stack
{
    static final int size=5;
    int top;
    int st[]=new int[size];
    
    Stack()
    {
        top=-1;
    }
    
    boolean isEmpty()
    {
        return (top<0);
    }
    
    boolean  push(int x)
    {
        if(top>=(size-1))
         {
            System.out.println("Stack is Overflow ");
            return false;
         }
        else
         {
            st[++top]=x;
            System.out.println(" Pushed into the stack "+x);
            return true;
         }
    }
    
    boolean pop()
    {
         if(top<0)
         {
            System.out.println("Stack is Underflow ");
            return false;
          }
        else
         {
            int x=st[top--];
            System.out.println(" Poped out from stack "+x);
            return true;
        }
    }
    int peek()
    {
        if(top<0)
         {
            System.out.println("Stack is Underflow ");
            return 0;
          }
        else
        {
            int x=st[top];
            return x;
        }
        
    }
    void display()
    {
        for(int x:st)
            System.out.print(x+" ");
    }
    
}
class StackDriver
{
    public static void main(String args[])
    {
         Stack st=new Stack();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Choice : ");
         String choice[]={ "1.PUSH","2.POP","3.PEEK","4.DISPLAY","5.END"};
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
                      System.out.println("Enter element to push");
                      x=sc.nextInt();
                      st.push(x);
                      break;
                  case 2:
                      st.pop();
                      break;
                  case 3:
                      x=st.peek();
                      System.out.println("Peek of stack : "+x);
                      break;
                  case 4:
                      st.display();
                  default:
                      System.out.println("Enter valid choice or End");

              }
         }while(c!=5);
        
    }
}