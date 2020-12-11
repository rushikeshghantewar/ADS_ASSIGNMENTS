import java.util.*;
class Largest
{
public static void main(String args[])
{
Set<Integer> numbers = new HashSet<>();
 
numbers.add(100);
numbers.add(35);
numbers.add(89);
numbers.add(71);
 
Iterator<Integer> iterator = numbers.iterator();
 
while (iterator.hasNext()) {
    Integer aNumber = iterator.next();
    System.out.println(aNumber);
}
}
}