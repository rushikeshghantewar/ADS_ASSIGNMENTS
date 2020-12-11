import java.util.*;
class MergeSort
{
    int input[];
    int length;
    int temp[];
 
    void sort(int in[])
    {
        this.input=in;
        this.length=in.length;
        this.temp=new int[length];
        divideArray(0, length-1);
    }
    void divideArray(int lowerIndex, int higherIndex)
    {
        if(lowerIndex<higherIndex)
        {
            int middle=lowerIndex + (higherIndex - lowerIndex)/2;
            divideArray(lowerIndex,middle);
            
            divideArray(middle+1,higherIndex);
            
            mergeArray(lowerIndex,middle,higherIndex);
        }
    }
    void mergeArray(int lowerIndex,int middle, int higherIndex)
    {
        for(int i=lowerIndex;i<=higherIndex;i++)
        {
            temp[i]=input[i];
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while((i<=middle) && (j<=higherIndex))
        {
            if(temp[i]<=temp[j])
            {
                input[k]=temp[i];
                i++;
            }
            else
            {
                input[k]=temp[j];
                j++;
            }
            k++;
        }
         while(i<=middle)
            {
                input[k]=temp[i];
                i++;
                k++;
            }
    }
    public static void main(String args[])
    {
        MergeSort mg=new MergeSort();
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
        
        mg.sort(input);//method call
        
         System.out.println("");
        System.out.println("Array After Sorting : ");
         for(int i:input)
         System.out.print(i+" ");
    }
}