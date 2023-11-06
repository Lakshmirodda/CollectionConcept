import java.util.*;
public class TreeHashm{
 public static void main(String[]args){
   TreeSet<Integer>s=new TreeSet<Integer>();
   s.add(1);
   s.add(2);
   s.add(5);
   s.add(3);
   s.add(0);
   System.out.println(s);
   Iterator<Integer> s1=s.iterator();
        while (s1.hasNext()) {
            System.out.println(s1.next());
        }

 } 
}