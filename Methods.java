import java.util.*;
public class Methods{
    public static void main(String[] args) {
          ArrayList<Integer> a = new ArrayList<>();
          a.add(10);
          a.add(20);
          a.add(30);
          System.out.println("Add = "+a);
          List<Integer> a1 = new ArrayList<>();
          a1.add(40);
          a1.add(50);
          a.addAll(a1);
          System.out.println("Add All = "+a);
          System.out.println("binary search = "+Collections.binarySearch(a,10));
          System.out.println("size = "+a.size());
          Collections.reverse(a);
          System.out.println("reverse = "+a);
          System.out.println("max = "+Collections.max(a));
          System.out.println("min = "+Collections.min(a));
          Collections.swap(a,3,4);
          System.out.println("swap = "+a);
          Collections.sort(a);
          System.out.println("sort = "+a);
          Collections.replaceAll(a,10,60);
          System.out.println("replace = "+a);
          Collections.rotate(a,3);
          System.out.println("rotate = "+a);
          Collections.reverseOrder();
          System.out.println("reverse order = "+a);
          Collections.shuffle(a);
          System.out.println("shuffle = "+a);
          Integer s=(Integer)a.get(2);
          System.out.println("get = "+a);
          System.out.println(" disjoint  = "+Collections.disjoint(a,a1));
          Collections.fill(a,5);
          System.out.println(" fill  = "+a);
          System.out.println(" is empty  = "+a.isEmpty());
          System.out.println(" containsAll  = "+a.containsAll(a1));
          System.out.println(" equals  = "+a.equals(a1));
          System.out.println(" remove  = "+a.remove(2));
          System.out.println(" hashcode  = "+a.hashCode());
    }
}