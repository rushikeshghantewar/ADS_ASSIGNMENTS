class ArrayTest
{
    public static void main(String args[])
    {
        long arr[]=new long[100];
        int n=0,j;
        arr[0]=23;
         arr[1]=56;
          arr[2]=12;
           arr[3]=66;
            arr[4]=54;
             arr[5]=89;
             n=6;
             long search;
        for(j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println("\n ***Search");
        
       search=56;
     for(j=0;j<n;j++)
     {
            if(arr[j]==search)
                break;
           if(j==n)
                System.out.println("Not found "+search+j);
            else
                 System.out.println("Found "+search);
     }   
     //Delete
       for(j=0;j<n;j++)
            if(arr[j]==search)
                break;
           for(int k=j;k<n-1;k++)
               arr[k]=arr[k+1];
                 n--;
        
        for(j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}