
import java.util.Scanner;

class InsertionSort
{
    static void sort(int no, int  arr[])
    {
       int n=no;
        int temp;
        //Before Swap
        for(int m:arr)
            System.out.print(m+" ");
              
       for(int i=1;i<n;i++)
       {
           for(int j=0;j<i;j++)
           {
               if(arr[j]>arr[i])
               {
                   temp=arr[j];
                   arr[j]=arr[i];
                   for(int k=i;k>j;k--)
                   {
                       arr[k]=arr[k-1];
                   }
                    arr[j+1]=temp;
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