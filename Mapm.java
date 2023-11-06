import java.util.*;
public class Mapm{
 public static void main(String[]args){
   Map<Integer,Integer>s=new HashMap<Integer, Integer>();
   s.put(1,20);
   s.put(2,40);
   s.put(4,40);
   s.put(3,null);
   System.out.println(s);
   Map<Integer,Integer>s1=new HashMap<Integer, Integer>();
   s1.put(5,50);
   s1.put(8,70);
   s1.put(7,60);
   System.out.println(s1);
   s.putAll(s1);
   System.out.println(s);       
   s.putIfAbsent(6,100);
   System.out.println(s); 
   System.out.println(s.get(1));
   System.out.println(s.getOrDefault(9,90));
   System.out.println(s.keySet());
   System.out.println(s.values());
   System.out.println(s.entrySet());
   System.out.println(s.replace(1,30));
   System.out.println(s);
   System.out.println(s.replace(2,40,110));
   System.out.println(s);
   System.out.println(s.remove(1));
   System.out.println(s);
   System.out.println(s.remove(2,110));
   System.out.println(s);
   System.out.println(s.size());
   System.out.println(s);
}
}