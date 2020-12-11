import java.util.*;
class ReverseString
{
    public static void main(String args[])
    {
        StringSt st=new StringSt();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String  : ");
        String s=sc.nextLine();
       for(int i=0;i<s.length();i++)
       {
           st.push(s.charAt(i));
       }
       for(int i=0;i<s.length();i++)
       {
           System.out.print(st.pop());
       }
       System.out.println("");
    }
}