class GenericsComp 
{
     <T extends Comparable<T>> void  comp(T a, T b, T c)
    {
        T max=a;
        if(b.compareTo(max)>0)
        {
            max=b;
        }
        if(c.compareTo(max)>0)
        {
            max=c;
        }
       System.out.println("Maximum : "+max);
        
    }
    public static void main(String args[])
    {
        GenericsComp gc=new GenericsComp();
        gc.comp(3,6,3);
        gc.comp(3.45f,6.78f,3.23f);
        gc.comp(3.22d,6.988d,3.667d);
    }
}