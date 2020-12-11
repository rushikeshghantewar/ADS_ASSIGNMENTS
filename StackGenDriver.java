class StackGen<T>
{
   /* static final int size=5;
    int top;
    T st;
    StackGen(T st)
    {       
        this.st=st;
        top=-1;
    }
    
    boolean isEmpty()
    {
        return (top<0);
    }
    
    boolean  push(T x)
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
            T x=st[top--];
            System.out.println(" Poped out from stack "+x);
            return true;
        }
    }
    boolean peek()
    {
        if(top<0)
         {
            System.out.println("Stack is Underflow ");
            return false;
          }
        else
        {
            T x=st[top];
            System.out.println(x);
        }
        
    }
    void display()
    {
        for(T x:st)
            System.out.print(x+" ");
    }
    
}
class StackGenDriver
{
    String s="{}[]()";
   for(int i=0;i<s.length();i++)
   {
       StackGen<String> sg=new StackGen<String>(s.charAt(i));
   }
    */
    
}