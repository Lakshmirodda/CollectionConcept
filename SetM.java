import java.util.*;
public class SetM{
 public static void main(String[]args){
   LinkedHashSet<Integer>s=new LinkedHashSet<Integer>();
   s.add(1);
   s.add(2);
   s.add(4);
   s.add(3);
   s.add(null);
   s.add(10);
   s.add(20);
   System.out.println(s);
    HashSet<Integer>s1=new HashSet<Integer>();
   s1.add(9);
   s1.add(5);
   s1.add(6);
   s1.add(7);
   s1.add(null);
   s1.add(30);
   s1.add(40);
   System.out.println(s1);
   s1.addAll(s);
   System.out.println(s1);
   s1.containsAll(s);
   System.out.println(s1);
   s1.retainAll(s);
   System.out.println(s1);
   s1.remove(4);
   System.out.println(s1);
   s1.removeAll(s);
   System.out.println(s1);
   
 } 
}