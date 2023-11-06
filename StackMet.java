import java.util.*;
public class StackMet {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        System.out.println("Stack =  " + s);
        System.out.println("Popped Element =  " +s.pop());
        System.out.println("Top Element =  " + s.peek());
        System.out.println("Is Stack Empty =  " + s.isEmpty());
        System.out.println("Stack =  " + s);
    }
}

