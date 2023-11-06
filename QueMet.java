import java.util.*;
public class QueMet {
    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<>();
        s.addFirst(10);
        s.addLast(20);
        s.offerFirst(90);
        s.offerLast(30);
        s.add(40);
        s.add(60);
        s.offer(70);
        System.out.println (s);
        System.out.println( s.peekFirst());
        System.out.println (s);
        System.out.println( s.peekLast());
        System.out.println (s);
        System.out.println(s.element());
        System.out.println (s);
        System.out.println( s.pollFirst());
        System.out.println (s);
        System.out.println( s.pollLast());
        System.out.println (s);
        System.out.println( s.removeFirst());
        System.out.println (s);
        System.out.println( s.removeLast());
        System.out.println (s);
        System.out.println( s.getFirst());
        System.out.println (s);
        System.out.println( s.getLast());
        System.out.println (s);
    }
}
