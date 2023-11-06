
import java.util.*;
public class Lin {
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<Integer>();
        s.add(10);
        s.add(20);
        s.offer(30);
        System.out.println (s);
        System.out.println( s.peek());
        System.out.println (s);
        System.out.println(s.element());
        System.out.println (s);
        System.out.println( s.poll());
        System.out.println (s);
        System.out.println( s.remove());
        System.out.println (s);
    }
}
