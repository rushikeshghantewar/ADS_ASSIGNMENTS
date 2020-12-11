package DataStructure;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=new Scanner(System.in).nextInt();
		System.out.println("Print Fibbonacci number ");
		for(int i=1;i<=number;i++)
		{
			if(number>=Fibnumber(i))
			{
			System.out.print(" "+Fibnumber(i));	
			}
		}
		System.out.println("");
		System.out.println("Fibonachi series of upto "+number);
		for(int i=1;i<=number;i++)
		{
			System.out.print(" "+Fibnumber(i));	
		}
		
		System.out.println("");
		System.out.println("Without recursion");
		int firstnumber=0;
		int secondnumber=1;
		
		int index=1;
		while(index<=number)
		{
			if(number>=firstnumber)
			{
			System.out.print(firstnumber+" ");
			}
			int sum= firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber= sum;
			index++;
		}

		System.out.println("");
		System.out.println("Without recursion part 2");
		int i=1;
		int m=0;
		int n=1;
		while(i<=number)
		{
			System.out.print(m+" ");
			int sum= m+n;
			m=n;
			n=sum;
			i++;
		}
	}
	
	private static int Fibnumber(int number)
	{
		if(number==1 || number==2)
		{
			return 1;
		}
		return Fibnumber(number-1)+Fibnumber(number-2);
	}

}
