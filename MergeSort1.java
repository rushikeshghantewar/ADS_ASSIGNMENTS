package DataStructure;


import java.util.Arrays;

public class MergeSort1 {
    int length;
    int array[];
    int tempMergeArray[];

public static void main(String args[]) {
  int []inputArr={48,36,13,52,19,21,9,87,56};
  System.out.print("Given Array");
  System.out.print(Arrays.toString(inputArr));
     MergeSort1 ms=new MergeSort1();
     ms.sort(inputArr);
    for (int i : inputArr)
    {
        System.out.print(i +" ");
    }
}
    public void sort(int inputArr[])
    {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArray=new int[length];
        divideArray(0,length-1);
    }

    public void divideArray(int lowerIndex,int higherIndex)
    {
        if(lowerIndex<higherIndex)
        {
            int middleIndex=lowerIndex+(higherIndex-lowerIndex)/2;
            System.out.println("");
            System.out.println("Mid Index"+middleIndex);
            divideArray(lowerIndex,middleIndex);
            divideArray(middleIndex+1,higherIndex);
            mergeArray(lowerIndex,middleIndex,higherIndex);
            System.out.println("=================");
            System.out.println(lowerIndex+" "+middleIndex+" "+higherIndex);
            System.out.println("xxxxxxxxxxxxxxxxx");
        }
        }
         public void mergeArray(int lowerIndex,int middleIndex,int higherIndex)
         {
             for(int i=lowerIndex;i<=higherIndex;i++)
             {
                 tempMergeArray[i]=array[i];
                 System.out.print(Arrays.toString(tempMergeArray));
             }
             
             int i=lowerIndex;
             int j=middleIndex+1;
             int k=lowerIndex;
             while (i<=middleIndex && j<=higherIndex)
             {
                 if(tempMergeArray[i]<=tempMergeArray[j]) {
                     array[k] = tempMergeArray[i];
                     i++;
                 }
                 else {
                     array[k] = tempMergeArray[j];
                     j++;
                 }
                 k++;
             }
             System.out.println("After 1st while");
             System.out.print(Arrays.toString(array));
             while (i<=middleIndex)
             {
                 array[k]=tempMergeArray[i];
                 k++;
                 i++;
             }
             System.out.println("After 2nd while");
             System.out.print(Arrays.toString(array));
         }
    }






