
class Check
{
    StringSt s=new StringSt();
    boolean isBalanced(String str)
    {
       for(int i=0;i<str.length();i++)//    ((){{))  (()
        {
            char c=str.charAt(i);
             if((c=='(') || (c=='[') || (c=='{') )
             {
                 s.push(c);
             }
             if(s.isEmpty())
                 return false;
             
             switch(c)
             {
                 case ')':
                     if(s.peek()=='(')
                     s.pop();
                     break;
                case ']':
                     if(s.peek()=='[')
                     s.pop();
                     break;
               case '}':
                     if(s.peek()=='{')
                     s.pop();
                     break;      
                       
             }
        }
       return s.isEmpty();
    }
}
class ParanthesisCheck
{
    public static void main(String args[])
    {
         Check c=new Check();
         if((c.isBalanced("[{()]")== true))
                 System.out.println("Balanced");
         else
                System.out.println("Not Balanced");
    }
}