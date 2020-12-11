class Test<T> 
{ 
    T obj; 
    Test(T obj) {  this.obj = obj;  } 
    public T getObject()  { return this.obj; } 
} 
class Generic
{ 
    public static void main (String[] args) 
    {  
        Test <Integer> iObj = new Test<Integer>(10); 
        System.out.println(iObj.getObject()); 
        Test <String> sObj = 
                          new Test<String>("Hello Java"); 
        System.out.println(sObj.getObject()); 
    } 
}