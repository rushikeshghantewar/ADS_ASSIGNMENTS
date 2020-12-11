import java.util.*;
class StringSt
{
    static final int size=20;
    int top;
    char st[]=new char[size];
    
    StringSt()
    {
        top=-1;
    }
    
    boolean isEmpty()
    {
        return (top<0);
    }
    
    boolean  push(char x)
    {
        if(top>=(size-1))
         {
            System.out.println("Stack is Overflow ");
            return false;
         }
        else
         {
            st[++top]=x;
           // System.out.println(" Pushed into the stack "+x);
            return true;
         }
    }
    
    char pop()
    {
         if(top<0)
         {
            System.out.println("Stack is Underflow ");
            return '0';
          }
        else
         {
            char x=st[top--];
            return x;
        }
    }
    char peek()
    {
        if(top<0)
         {
            System.out.println("Stack is Underflow ");
            return '0';
          }
        else
        {
            char x=st[top];
            return x;
        }
        
    }
    void display()
    {
        for(char x:st)
            System.out.print(x);
    }
    
}
class StringStack
{
    public static void main(String args[])
    {
         StringSt st=new StringSt();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Choice : ");
         String choice[]={ "1.PUSH","2.POP","3.PEEK","4.DISPLAY","5.END"};
         int c;
         do
         {
              for (String s:choice)
              System.out.println(s);
              c =sc.nextInt();
              char x;
              switch(c)
              {
                  case 1:
                      System.out.println("Enter element to push");
                      x=sc.next().charAt(0);
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