class Factorial
{
    static int fc2=1;
    //using for loop
    void fact1(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial : "+fact);
    }
    //using recursion 
    int  fact2(int n)
    {
        if(n==0)
           return 1;
        else
           return fc2=n*fact2(n-1);
    }
    public static void main(String args[])
    {
        Factorial f=new Factorial();
        f.fact1(4);
        int ans=f.fact2(4);
        System.out.println("Factorial : "+ans);
    }
}