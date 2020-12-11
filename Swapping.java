class Swapping <T>
{
    void swap(T x, T y)
    {
        System.out.println("Before Swapping No. a="+x+" b="+y);
        T temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping No. a="+x+" b="+y+"\n");
    }
    public static void main(String args[])
    {
        Swapping s=new Swapping();
                s.swap(3, 7);
                s.swap(5.34f, 7.34f);
                s.swap(5.12d, 9.34d);
    }
}