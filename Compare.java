class Compare
{
    public static void main(String args[])
    {
        /*int a=2,b=3,c=9;        
        int max=0;*/
       /* float a=2.2,b=3.4,c=9.2;        
        float max=0;*/
        double a=2.556,b=3.22,c=9.8;        
        double max=0;
        if((a>b) && (a>c))
        {
            max=a;
        }
        else if((b>a) && (b>c))
        {
            max=b;
        }
        else
        {
            max=c;
        }
        System.out.println("Maximum : "+max);
    }
}