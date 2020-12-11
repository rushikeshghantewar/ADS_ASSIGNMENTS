import java.util.*;
class QuickSort
{
    int partition(int arr[], int low,int high)
    {
        int pivote=arr[(low+high)/2];
        while(low<=high)
        {
            while(arr[low]<pivote)
            {
                low++;
            }
            while(arr[high]>pivote)
            {
                high--;
            }
            if(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void quickSort(int arr[],int low, int high)
    {
        int pi=partition(arr,low,high);
        if(low<pi-1)
        {
            quickSort(arr,low,pi-1);
        }
        if(pi<high)
        {
            quickSort(arr,pi,high);
        }
    }
    public static void main(String args[])
    {
        QuickSort q=new QuickSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of element  array");
        int n=sc.nextInt();
        int input[]=new int[n];
        System.out.println("Enter of element  array");
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextInt();
        }
        System.out.println("Array Before Sorting : ");
        for(int i:input)
            System.out.print(i+" ");
        
        q.quickSort(input, 0,n-1);
        
        System.out.println("Array After Sorting : ");
        for(int i:input)
            System.out.print(i+" ");
    }
}