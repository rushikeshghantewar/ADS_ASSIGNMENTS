import java.util.Scanner;
import java.util.Arrays;
class sum 
{
	public static void main(String arg[])	
	{
                  int n;
		  int i=0;
                  int s=0,a[];
		  int sm=0;
                  Scanner sc=new Scanner(System.in);
	    System.out.println("Enter how many numbers you want sum");	   
                   n=sc.nextInt();
                  a=new int[n];
	    
	    System.out.println("Enter the choice");
	    System.out.println("1.Using Iteration");
	    System.out.println("2.Using Recursion");
	    int choice=sc.nextInt();
	    System.out.println("enter the "+n+" numbers ");
	    switch(choice){
case 1:
while(i<n)
                   {      
	       System.out.println("Enter  number  "+(i+1)+":");
                      a[i]=sc.nextInt();
	       sm+=a[i];    
	       i++;     
                    }
                 System.out.println("sum is ="+sm);
		break;
case 2:
	    
                     for(i=0;i<n;i++)
                     {      
	             System.out.println("enter  number  "+(i+1)+":");
                            a[i]=sc.nextInt();
                      }
	      s=sum.sumofnum(a,n-1,s);	    
                    System.out.println("sum is ="+s);
		    break;
default:
		    System.out.println("You Entered Invalid Choice");
}
          
              	}

    static int sumofnum(int a[],int n,int s1)
   {
              if(n<0)
             return s1;
             else
             {
               s1+=a[n];
              
	 return sum.sumofnum(a,n-1,s1);
            }
  }
 
}