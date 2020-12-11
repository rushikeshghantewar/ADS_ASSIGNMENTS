import java.util.*;
class Array
{
    static int ar[];
    Scanner sc=new Scanner(System.in);
    void insertion()
    {
        System.out.println("Enter Size of array");
        int x=sc.nextInt();
        this.ar=new int[x];
        System.out.println("Enter elements in array ");
        for(int  i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
    }
    void display()
    {
        System.out.println("Array : ");
        for(int n:ar)
            System.out.print(n+" ");
         System.out.print("\n");
    }
    void max()
    {
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println("Maximum element is :"+max);
    }
    void sum()
    {
        int sum=0;
        for(int i=0; i<ar.length;i++)
        {
            sum+=ar[i];
        }
         System.out.println("Sum of all elements of array is :"+sum);
    }
}
class ArrayOp
{
    public static void main(String args[])
    {
        Array a=new Array();
        a.insertion();
        a.display();
        a.max();
        a.sum();
    }
}