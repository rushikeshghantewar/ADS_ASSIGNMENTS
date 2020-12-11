import java.util.*;
class BubbleSort
{
    static void sort(int no, int  arr[])
    {
       int n=no;
        int temp;
        //Before Swap
        for(int m:arr)
            System.out.print(m+" ");
        for(int j=0;j<n-1;j++)
        {
            for(int i=0;i<n-1-j;i++)
            {
               if(arr[i]>arr[i+1])
               {
                   temp=arr[i+1];
                   arr[i+1]=arr[i];
                   arr[i]=temp;
               }
            }
        }
        System.out.println(" ");
         //After Swap
        for(int m:arr)
            System.out.print(m+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of element");
        int n=sc.nextInt();
        System.out.println("Enter element of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(n,arr);
    }
}