import java.util.*;
public class PriqueMet {
    public static void main(String[] args) {
        Queue<Integer> s = new PriorityQueue<Integer>();
        s.add(50);
        s.add(200);
        s.offer(300);
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

